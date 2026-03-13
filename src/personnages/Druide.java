package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocter " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
		
	}
	
	private void prendreLouche() {
		if (chaudron.resterPotion()) {
			chaudron.quantitePotion = chaudron.quantitePotion - 1;
		}
		else {
			chaudron.forcePotion = 0;
		}
	}
	
	public void bousterGaulois(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if (nomGaulois == "Obélix") {
			this.parler("Non, " + nomGaulois + " Non !... Et tu le sais très bien !") ;
		}
		else {
		if (chaudron.resterPotion()) {
			prendreLouche(); // TODO
			gaulois.boirePotion(chaudron.forcePotion); // TODO
			this.parler("Tiens " + nomGaulois + " un peu de potion magique ?");		
		}
		else {
			this.parler("Désolé " + nomGaulois + " il n'y a plus une seule goutte de potion.");
		}}
	
}}
