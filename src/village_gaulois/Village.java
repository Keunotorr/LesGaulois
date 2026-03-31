package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private Gaulois chef;
	private int nbVillageois = 1;
	private int max_villageois;
	private Gaulois[] villageois;
	
	public Village(String nom, Gaulois chef,final int max_villageois) {
		this.nom = nom;
		this.chef = chef;
		this.max_villageois = max_villageois;
		villageois = new Gaulois[max_villageois];
		villageois[0] = chef;
	}
	
	public String getNom() {
		return nom;
		}
	
	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < max_villageois) {
		villageois[nbVillageois] = gaulois;
		gaulois.SetVillage(this);
		nbVillageois = nbVillageois +1;}
		
		else {
			System.out.print("Il y a trop de villageois dans le village !");
	}}
	
	public Gaulois trouverVillageois(int numero) {
		if (numero > nbVillageois) {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
		
		else {
			return villageois[numero-1];}
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village " + this.nom + " du chef " + this.chef.getNom() + " vivent les légendaires gaulois : ");
		for (int i = 0; i< this.nbVillageois; i++) {
			System.out.println(" - " + this.villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		
		Gaulois obelix = new Gaulois("Obélix", 16);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
		Gaulois doublePolemix = new Gaulois("Doublepolemix", 4);
		abraracourcix.SePresenter();
		asterix.SePresenter();
		doublePolemix.SePresenter();
	}
	
}
