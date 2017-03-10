public class Symbole {
	protected String nom;
	
	Symbole(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCouleur(){
		return "rouge";
	}
}
