package entities;

public class Client {
	protected int idClient;
	protected String nom;
	protected String prenom;
	protected int age;
	protected String adresse;
	protected String ville;
	protected String mail;
	
	//
	public Client() {
		
	}
	//constructor to add a new client
	public Client(String nom,String prenom,int age,String adresse,String ville,String mail) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.ville = ville;
		this.mail = mail;
		
	}
	
	//constructor to modify a client
	public Client(int idClient,String nom,String prenom,int age,String adresse,String ville,String mail) {
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.ville = ville;
		this.mail = mail;
		
	}
	
	
	// declaration of setters
	public int getIdClient() {
		return idClient;
	}
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}	
	public int getAge() {
		return age;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public String getVille() {
		return ville;
	}
	
	public String getMail() {
		return mail;
	}
	
	//declaration of getters
	public void setIdClient(int id) {
		this.idClient=id;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public void setAdresse(String adresse) {
		this.adresse=adresse;
	}
	
	public void setVille(String ville) {
		this.ville=ville;
	}
	
	public void setMail(String mail) {
		this.mail=mail;
	}


	
	
}
