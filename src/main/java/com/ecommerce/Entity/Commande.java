package com.ecommerce.Entity;

import java.util.*;

public class Commande {
	private int id;
	private int dateCommande;
	private User user;
	private List<LigneCommande> listeLigneCommande;
	//list de ligne de commande ?
	
	public Commande() {}
	
	public Commande(int dateCommande, User user) {
		this.dateCommande = dateCommande;
		this.user= user;
	}
	
	public Commande(int id, int dateCommande, User user) {
		this.id = id;
		this.dateCommande = dateCommande;
		this.user= user;
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