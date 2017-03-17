public class Bataille {
	private JeuDeCartes jeu;
	Bataille(String nom, int type){
		Joueur j1 = new Joueur("Joueur 1");
		Joueur j2 = new Joueur("Joueur 1");
		
		if(type == 32){
			Jeu32 jeu = new Jeu32("Jeu de 32 cartes");
			jeu.battre(42);
			for (int i=0; i<32;i++){
				j1.prendreCarte(jeu.getPremiereCarte());
				j2.prendreCarte(jeu.getPremiereCarte());
			}
		}
		else if(type==52){
			Jeu52 jeu = new Jeu52("Jeu de 52 cartes");
			jeu.battre(42);
			for (int i=0; i<52;i++){
				j1.prendreCarte(jeu.getPremiereCarte());
				j2.prendreCarte(jeu.getPremiereCarte());
			}
		}
	}
	
	private void distribuer(){
		while (!jeu.estVide()){
			j1.prendreCarte(jeu.getPremiereCarte());
			j2.prendreCarte(jeu.getPremiereCarte());
		}
	}
}
