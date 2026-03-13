package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romains;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		Romains minus = new Romains("Minus", 6);
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Miunus.");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus); }
	}
}
