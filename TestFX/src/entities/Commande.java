package entities;

import java.util.Date;


public class Commande {
	protected int idComm;
	protected int idClient;
	protected Date Date;
	
	
	public Commande() {
		
	}
	
	public Commande(int idComm,int idClient,Date Date) {
		this.idComm=idComm;
		this.idClient=idClient;
		this.Date=Date;
	}
	
	//getters
	public int getIdComm() {
		return idComm;
	}
	
	public int getIdClient() {
		return idClient;
	}
	
	public Date getDate() {
		return Date;
	}
	
	//setters
	
	public void setIdComm(int idComm) {
		this.idComm=idComm;
	}
	
	public void setIdClient(int idClient) {
		this.idClient=idClient;
	}
	
	public void setDate(Date Date) {
		this.Date=Date;
	}
}
