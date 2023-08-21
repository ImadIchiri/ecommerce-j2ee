package com.ecommerce.Entity;

public class Commande {
	private int id;
	private int dateCommande;
	private User user;
	
	public Commande() {}
	
	public Commande(int dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	public Commande(int id, int dateCommande) {
		this.id = id;
		this.dateCommande = dateCommande;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(int dateCommande) {
		this.dateCommande = dateCommande;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}