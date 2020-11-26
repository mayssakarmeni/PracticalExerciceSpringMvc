package org.polytec.vermeg.service;

import javax.transaction.Transactional;

import org.polytec.vermeg.dao.IbookDAO;
import org.polytec.vermeg.mapping.Commande;
import org.polytec.vermeg.mapping.LigneCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CommandeService")
public class CommandeService {

	@Autowired
	IbookDAO bookDAO;
	
	
	
	@Transactional
	public double getSommeTotal(Commande commande) {
    double somme=0;
    
    if (commande.getLigneCommande()!=null && commande.getLigneCommande().size()>0) {
    	
    	for (LigneCommande ligne : commande.getLigneCommande()) {
    		
    		double prix=bookDAO.getbookByID(ligne.getIdbook()).getPrice();
    		
    		somme+=(prix*ligne.getQuantite());
    		
    		
    		
    	}
    	
    	
    	
    }

     
    
    return somme ;
	}
	
}
