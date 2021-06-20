package entities;
//import java.util.Date;

public class Commande {
	protected int id_comm;
	protected int id_client;
	protected String date;
	
	
	public Commande() {
		
	}
	
	public Commande(int id_comm,int id_client,String date) {
		this.id_comm=id_comm;
		this.id_client=id_client;
		this.date=date;
	}
	
	//getters
	public int getIdComm() {
		return id_comm;
	}
	
	public int getIdClient() {
		return id_client;
	}
	
	public String getDate() {
		return date;
	}
	
	//setters
	
	public void setIdComm(int id_comm) {
		this.id_comm=id_comm;
	}
	
	public void setIdClient(int id_client) {
		this.id_client=id_client;
	}
	
	public void setDate(String date) {
		this.date=date;
	}
}
