package personnages;

import objets.Equipement;

public class Romains {
	private String nom;
	private int force;
	private Equipement equipement[] = new Equipement[2];
	private int nbEquipement = 0;
	
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
	
	public void sEquiper(Equipement equipement) {
			switch(this.nbEquipement) {
				case 2 :
					System.out.println("Le soldat " + this.nom + " est déja bien protégé !");
					break;
				
				default :
					if (equipement == Equipement.BOUCLIER && this.equipement[1] == null) {
						this.equipement[1] = equipement;
						System.out.println("Le soldat " + this.nom + " s'équipe d'un bouclier");
						this.nbEquipement = this.nbEquipement + 1;
					}
					else if (equipement == Equipement.CASQUE && this.equipement[0] == null) {
						this.equipement[0] = equipement;
						System.out.println("Le soldat " + this.nom + " s'équipe d'un casque");
						this.nbEquipement = this.nbEquipement + 1;
					}
					else if (equipement == Equipement.CASQUE) {
						System.out.println("Le soldat " + this.nom + " a déja un casque.");
					}
					else {
						System.out.println("Le soldat " + this.nom + " a déja un bouclier.");
					}
					break;
					
			}
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
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
