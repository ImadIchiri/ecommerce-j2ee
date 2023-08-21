package com.ecommerce.Entity;

public class Produit {
	private int id;
	private Categorie categorie;
	private String nom;
	private int quantityDispo;
	private double prix;
	
	public Produit() {}
	
	public Produit(Categorie categorie, String nom, int quantityDispo, double prix) {
		this.categorie = categorie;
		this.nom = nom;
		this.quantityDispo = quantityDispo;
		this.prix = prix;
	}
	
	public Produit(int id, Categorie categorie, String nom, int quantityDispo, double prix) {
		this.id = id;
		this.categorie = categorie;
		this.nom = nom;
		this.quantityDispo = quantityDispo;
		this.prix = prix;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getQuantityDispo() {
		return quantityDispo;
	}
	public void setQuantityDispo(int quantityDispo) {
		this.quantityDispo = quantityDispo;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}