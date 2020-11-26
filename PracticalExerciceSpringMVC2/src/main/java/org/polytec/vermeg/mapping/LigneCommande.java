package org.polytec.vermeg.mapping;

public class LigneCommande {

	private int quantite ;

	 private long idbook;

	 private Commande commande;

	

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public long getIdbook() {
		return idbook;
	}

	public void setIdbook(long idbook) {
		this.idbook = idbook;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public LigneCommande(int quantite, long idbook) {
		super();
		this.quantite = quantite;
		this.idbook = idbook;
		
	}

	public LigneCommande() {
		
	}


		
	

}
