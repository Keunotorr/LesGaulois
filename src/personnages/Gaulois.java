package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		}
	
	public String getNom() {
		return nom;
		}
	
	public void SetVillage(Village village) {
		this.village = village;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	public void frapper(Romains romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force * effetPotion) /3);
		if (effetPotion > 1) {
			effetPotion = effetPotion -1 ;
		}
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}
	
	public void SePresenter() {
		if (village != null) {
			if (village.getChef().getNom().equals(nom)) {
				System.out.println(" Le Gaulois " + nom + " : Bonjour, je m'appelle "+ nom +". Je suis le chef du village : " + village.getNom());
			}
			else {
				System.out.println(" Le Gaulois " + nom + " : Bonjour, je m'appelle "+ nom +". J'habite dans le village : " + village.getNom());
			}
	}
		else {
			System.out.println(" Le Gaulois " + nom + " : Bonjour, je m'appelle "+ nom +". Je voyage de villages en villages" );
		}
			
	}
	
}
