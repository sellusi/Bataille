public class Jeu52 extends JeuDeCartes {

	public Jeu52(String nom) {
		super(nom);
	}
	
	@Override
	public int getCoupe() {
		return (int) ((Math.random() * 51)+1);
	}

	@Override
	void remplirUnJeu() {

	}
}
