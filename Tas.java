import java.util.LinkedList;

public class Tas {
	private LinkedList<carte> lesCartes;
	private String nom;
	
	public Tas() {
		lesCartes = new LinkedList<carte>();
		nom = "";
	}

	public Tas(String nom) {
		this();
		this.nom = nom;
	}
	
	public Tas(Tas tas) {
		this.nom = new String(tas.nom);
		this.lesCartes = new LinkedList<carte>(tas.lesCartes);
	}
	
	public LinkedList<carte> getLesCartes() {
		return lesCartes;
	}

	public void setLesCartes(LinkedList<carte> lesCartes) {
		this.lesCartes = lesCartes;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public String toString() {
		return "Tas [lesCartes=" + lesCartes + ", nom=" + nom + "]";
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	boolean estVide() {
		return lesCartes.isEmpty();
	}
	
	int getTaille(){
		return lesCartes.size();
	}
	
	void ajouterCarte(carte c){
		lesCartes.add(c);
	}
	
	void ajouterTous(Tas tas){
		for(carte c : tas.lesCartes)
			ajouterCarte(c);
	}
	
	carte getPremiereCarte(){
		return lesCartes.pop();
	}
}
