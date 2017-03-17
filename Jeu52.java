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
		for(Hauteur h : Hauteur.values()){				//hauteur
			for(int j=0 ; j < 4 ;j++){					//symboles
				this.ajouterCarte(new carte(h,JeuDeCartes.LES_SYMBOLES[j] ));
			}
		}
	}
}
