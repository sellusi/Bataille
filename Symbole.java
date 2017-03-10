public class Symbole {
	protected String nom;
	
	Symbole(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Symbole [nom=" + nom + ", Couleur=" + getCouleur() + "]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCouleur(){
		if(nom.equals("Coeur")||nom.equals("Carreau"))
			return "rouge";
		else if(nom.equals("Trèfle")||nom.equals("Pique"))
			return "noir";
		return null;
	}
}
