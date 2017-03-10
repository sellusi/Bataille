public abstract class JeuDeCartes implements Melangeable,Ordre{
	
	static Symbole[] LES_SYMBOLES = new Symbole[4];
		LES_SYMBOLES[1]=new Trefle();
		LES_SYMBOLES[2]=new Pique();
		LES_SYMBOLES[3]=new Coeur();
		LES_SYMBOLES[4]=new Carreau();
		
	static int TYPE_32 =32;
	static int TYPE_52=52;
	
	abstract void remplirUnJeu();
}	
