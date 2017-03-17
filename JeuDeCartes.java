public abstract class JeuDeCartes extends Tas implements Melangeable,Ordre{
	
	JeuDeCartes(String nom){
		super(nom);
	}
	
	
	final Symbole[] LES_SYMBOLES = {new Trefle(),
									new Pique(),
									new Coeur(),
									new Carreau()
									};
		
	final int TYPE_32 =32;
	final int TYPE_52=52;
	
	abstract void remplirUnJeu();
}	
