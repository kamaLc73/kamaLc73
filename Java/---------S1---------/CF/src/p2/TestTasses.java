package p2;


class Liquide {
 public void imprimer() {
     System.out.println("Je suis un liquide");
 }
}

class Cafe extends Liquide {
 @Override
 public void imprimer() {
     System.out.println("Je suis un Café");
 }
}

class Lait extends Liquide {
 @Override
 public void imprimer() {
     System.out.println("Je suis du Lait");
 }
}

class Tasse {
 private Liquide liquide;

 public void ajouterLiquide(Liquide liquide) {
     this.liquide = liquide;
 }

 public void imprimer() {
     if (liquide != null) {
         liquide.imprimer();
     } else {
         System.out.println("La tasse est vide");
     }
 }
}

public class TestTasses {
 public static void main(String[] args) {
     Liquide liquide = new Liquide();
     Cafe cafe = new Cafe();
     Lait lait = new Lait();

     Tasse[] tasses = new Tasse[3];

     tasses[0] = new Tasse();
     tasses[0].ajouterLiquide(liquide);

     tasses[1] = new Tasse();
     tasses[1].ajouterLiquide(cafe);

     tasses[2] = new Tasse();
     tasses[2].ajouterLiquide(lait);

     for (Tasse tasse : tasses) {
         tasse.imprimer();
     }
 }
}
