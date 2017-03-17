public class Jeu32 extends JeuDeCartes {
	
	Jeu32(String nom){
		super(nom);
	}

	@Override
	public int getCoupe() {
		return Math.random()-32;
	}

	@Override
	public void battre(int m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int comparerCartes(carte c1, carte c2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void remplirUnJeu() {
		// TODO Auto-generated method stub
		
	}
}
