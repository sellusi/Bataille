public class Symbole {
	protected String nom;
	
	Symbole(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return  nom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		if (nom.equals("Coeur")||nom.equals("Carreau")||nom.equals("Trèfle")||nom.equals("Pique")){
			this.nom = nom;
		}
		else
			System.out.println("invalide");
	}
	public String getCouleur(){
		if(nom.equals("Coeur")||nom.equals("Carreau"))
			return "rouge";
		else if(nom.equals("Trèfle")||nom.equals("Pique"))
			return "noir";
		return null;
	}
}
