public abstract class JeuDeCartes extends Tas implements Melangeable,Ordre{
	
	JeuDeCartes(){
		super();
	}
	
	
	public JeuDeCartes(String nom) {
		super(nom);
	}


	final Symbole[] LES_SYMBOLES = {new Trefle(),
									new Pique(),
									new Coeur(),
									new Carreau()
									};

	final int TYPE_32 =32;
	final int TYPE_52=52;
	
	@Override
	public int comparerCartes(carte c1, carte c2) {
		return ((c1.getHauteur()).getValeur()-(c2.getHauteur()).getValeur());
	}
	
	@Override
	public void battre(int m) {
		Tas t1 = new Tas();
		Tas t2 = new Tas();
		int i;
		int j;
		int position = this.getCoupe();
		for(i=0; i<m;i++){
			for(j=0;j<this.getCoupe();j++)
				t1.ajouterCarte(this.getPremiereCarte());
			for(j=position;j<this.getTaille();j++)
				t2.ajouterCarte(this.getPremiereCarte());
			while(!t1.estVide()&&!t2.estVide()){
				this.ajouterCarte(t1.getPremiereCarte());
				this.ajouterCarte(t2.getPremiereCarte());
			}
			if(t1.estVide())
				this.ajouterTous(t2);
			else if(t2.estVide())
				this.ajouterTous(t1);
		}
	}
	
	
	abstract void remplirUnJeu();
}	
