public class Jeu32 extends JeuDeCartes {
	
	Jeu32(String nom){
		super(nom);
	}

	@Override
	public int getCoupe() {
		return (int) ((Math.random() * 31)+1);
	}

	@Override
	void remplirUnJeu() {
		int i;
		for (i=0;i<32;i++){
			
		}
	}

	
}
