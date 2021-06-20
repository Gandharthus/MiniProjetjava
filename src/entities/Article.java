package entities;

public class Article {
	protected int id_article;
	protected String design;
	protected int prix;
	protected String categorie;

	//
	public Article() {
		
	}
	//constructor to add a new client
	public Article(String design,int prix,String categorie) {
		this.design = design;
		this.prix = prix;
		this.categorie = categorie;
		
	}
	
	//constructor to modify a client
	public Article(int id_article,String design,int prix,String categorie) {
		this.id_article = id_article;
		this.design = design;
		this.prix = prix;
		this.categorie = categorie;
	}
	
	
	// declaration of setters
	public int getIdarticle() {
		return id_article;
	}
	public String getDesign() {
		return design;
	}
	
	public int getPrix() {
		return prix;
	}	
	public String getCategorie() {
		return categorie;
	}
	
	
	//declaration of setters
	public void setIdArticle(int id) {
		this.id_article=id;
	}
	public void setDesign(String design) {
		this.design=design;
	}

	public void setPrix(int prix) {
		this.prix=prix;
	}
	
	public void setCategorie(String categorie) {
		this.categorie=categorie;
	}

	
}
