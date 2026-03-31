package personnages;

public class Romains {
	private String nom;
	private int force;
	
	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified(force);
		}
	
	public String getNom() {
		return nom;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
		}
	
	public void recevoirCoup(int forceCoup) {
		assert forceCoup > 0 : "la force du coup reçu est positive" ;
		int f_temp = force;
		force = force - forceCoup;
		if (force < 1) {
			parler("J'abandonne !");
			prendreParole();
			force = 0;
		} else {
			parler("Aïe");
		}
		assert isInvariantVerified(force);
		assert f_temp > forceCoup : "la force d’un Romain a diminué";
			
	}
	
	private boolean isInvariantVerified(int force) {
		if (force >= 0) {
			return true;
		}
		else {
			System.out.println("la force d’un Romain est toujours positive");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Romains minus = new Romains("Minus", 6);
	}
}
