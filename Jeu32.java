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
		for(Hauteur h : Hauteur.values()){				//hauteur
			for(int j=0 ; j < 4 ;j++){					//symboles
				if(h.getValeur()>6)
					this.ajouterCarte(new carte(h,JeuDeCartes.LES_SYMBOLES[j] ));
			}
		}
	}
	
}
