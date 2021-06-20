package entities;

public class Ligne {
	protected int id_article;
	protected int id_comm;
	protected int quantite;
	protected double prix_unite;
	
	public Ligne () {
		
	}
	
	public Ligne(int id_article,int id_comm,int quantite,double prix_unite) {
		this.id_article=id_article;
		this.id_comm=id_comm;
		this.quantite=quantite;
		this.prix_unite=prix_unite;
	}
	
	//getters
	
	public int getIdArticle() {
		return id_article;
	}
	
	public int getIdComm() {
		return id_comm;
	}

	public int getQuantite() {
		return quantite;
	}

	public double getPrixUnite() {
		return prix_unite;
	}

	//setters
	
	public void setIdArticle(int id_article) {
		this.id_article=id_article;
	}
	
	public void setIdComm(int id_comm) {
		this.id_comm=id_comm;
	}
	
	public void setQuantite(int quantite) {
		this.quantite=quantite;
	}
	
	public void setPrixUnite(int prix_unite) {
		this.prix_unite=prix_unite;
	}

}
