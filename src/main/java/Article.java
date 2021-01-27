/**
 * @author Alex
 */

public class Article {
	
	private String reference;
	private String nom;
	private int stock;
	private double prix;
	
	public Article() {
		
	}
	
	public Article(String reference, String nom, int stock, double prix) {
		this.reference = reference;
		this.nom = nom;
		this.stock = stock;
		this.prix = prix;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		stock = stock;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public void approvisionnerArticle(int nbArticle) {
		this.stock = stock + nbArticle;
	}
	
	

}
