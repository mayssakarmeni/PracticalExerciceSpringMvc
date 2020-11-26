package org.polytec.vermeg.mapping;

import java.sql.Date;
import java.util.List;

public class Commande {
	
	private Long idCommande;
	private int num;
	private Date dateCmd;
	
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Date getDateCmd() {
		return dateCmd;
	}
	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	
	
	public Commande(Long idCommande, int num, Date dateCmd, List<LigneCommande> ligneCommande) {
		super();
		this.idCommande = idCommande;
		this.num = num;
		this.dateCmd = dateCmd;
		this.ligneCommande = ligneCommande;
	}
	public Commande() {
		
	}

     private List<LigneCommande> ligneCommande;

	public List<LigneCommande> getLigneCommande() {
		return ligneCommande;
	}
	public void setLigneCommande(List<LigneCommande> ligneCommande) {
		this.ligneCommande = ligneCommande;
	}
	
	
	
}

