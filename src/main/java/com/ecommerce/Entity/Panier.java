package com.ecommerce.Entity;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	private static int idCounter = 0;
	private int id;
	private List<LignePanier> listLignePanier = new ArrayList<LignePanier>();

	public Panier() {
		this.id = idCounter;
		idCounter++;
	}
	
	public Panier(int id) {
		this.id = idCounter;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}