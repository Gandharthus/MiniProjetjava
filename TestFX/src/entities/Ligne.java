package entities;

public class Ligne {
	protected String idArticle;
	protected int idComm;
	protected int quantite;
	protected double prixUnite;
	
	public Ligne () {
		
	}
	
	public Ligne(String id_article,int id_comm,int quantite,double prix_unite) {
		this.idArticle=id_article;
		this.idComm=id_comm;
		this.quantite=quantite;
		this.prixUnite=prix_unite;
	}
	
	//getters
	
	public String getIdArticle() {
		return idArticle;
	}
	
	public int getIdComm() {
		return idComm;
	}

	public int getQuantite() {
		return quantite;
	}

	public double getPrixUnite() {
		return prixUnite;
	}

	//setters
	
	public void setIdArticle(String id_article) {
		this.idArticle=id_article;
	}
	
	public void setIdComm(int id_comm) {
		this.idComm=id_comm;
	}
	
	public void setQuantite(int quantite) {
		this.quantite=quantite;
	}
	
	public void setPrixUnite(int prix_unite) {
		this.prixUnite=prix_unite;
	}

}
