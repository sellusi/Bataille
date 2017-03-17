public class Joueur {
	private String nom;
	private Tas tas;
	
	Joueur(String nom){
		this.nom = nom;
	}
	
	boolean estMainVide(){
		return(tas.estVide());
	}
	
	int getNbrCartes(){
		return tas.getTaille();
	}
	
	void prendreCarte(carte c){
		tas.ajouterCarte(c);
	}
	
	void prendreTous(Tas tas){
		tas.ajouterTous(tas);
	}
	
	carte jouer(){
		return (tas.getPremiereCarte());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Tas getTas() {
		return tas;
	}

	public void setTas(Tas tas) {
		this.tas = tas;
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + ", tas=" + tas + "]";
	}
}
