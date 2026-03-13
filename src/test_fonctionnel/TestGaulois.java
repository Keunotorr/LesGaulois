package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romains;

public class TestGaulois {
	public static void main(String[] args) {
		// Partie 1
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romains minus = new Romains("Minus", 6);
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Miunus.");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus); }
		
		// Partie 2
		System.out.println("");
		Romains brutus = new Romains("Brutus", 14);
		Druide paronamix = new Druide("Paronamix", 2);
		paronamix.fabriquerPotion(4, 3);
		paronamix.bousterGaulois(obelix);
		paronamix.bousterGaulois(asterix);
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus); }		
}}