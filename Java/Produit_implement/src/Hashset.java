package com.java.india;

import java.util.HashSet;

public class Hashset {
	public class Main {
		  public static void main(String[] args) {
		    // Créer un HashSet
		    HashSet<String> hash = new HashSet<String>();

		    // Ajouter des éléments au HashSet
		    hash.add("Java");
		    hash.add("Pascal");
		    hash.add("PHP");
		    hash.add("Python");
		    hash.add("Java"); // Ajouter un élément dupliqué

		    // Afficher le HashSet
		    System.out.println(hash);

		    // Vérifier si un élément est présent dans le HashSet
		    System.out.println("Est-ce que Java se trouve dans le HashSet: " + hash.contains("Java"));

		    // Supprimer des éléments du HashSet
		    hash.remove("Pascal");
		    System.out.println("HashSet après la suppression: " + hash);
		  }
		}

}
