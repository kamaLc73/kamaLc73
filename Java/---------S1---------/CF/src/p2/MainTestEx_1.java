package p2;

class PointR2 {
	 public double x;
	 public double y;
	
	 public PointR2() {
	     this.x = 0;
	     this.y = 0;
	 }
	
	 public PointR2(double a, double b) {
	     this.x = a;
	     this.y = b;
	 }
	
	 public double distance(PointR2 p) {
	     double dx = this.x - p.x;
	     double dy = this.y - p.y;
	     return Math.sqrt(dx * dx + dy * dy);
	 }
	
	 @Override
	 public boolean equals(Object o) {
	     if (this == o) return true;
	     if (o instanceof PointR2 || o == null) return false;
	     PointR2 p = (PointR2) o;
	     return  p.x == x && p.y == y;
	 }
	
	 @Override
	 public String toString() {
	     return "PointR2(" + x + ", " + y + ")";
	 }
}

class Rectangle {
	 public PointR2 ext1;
	 public PointR2 ext2;
		
	 public Rectangle(PointR2 p, PointR2 q) {
	     this.ext1 = p;
	     this.ext2 = q;
	 }
	
	 public Rectangle() {
	     this.ext1 = new PointR2();
	     this.ext2 = new PointR2();
	 }
	
	 public Rectangle(PointR2 cig, double l, double h) {
	     this.ext1 = cig;
	     this.ext2 = new PointR2(cig.x + l, cig.y + h);
	 }
	
	 public double longueur() {
	     return Math.abs(ext2.x - ext1.x);
	 }
	
	 public double hauteur() {
	     return Math.abs(ext2.y - ext1.y);
	 }
	
	 public double perimetre() {
	     return 2 * (longueur() + hauteur());
	 }
	
	 public double surface() {
	     return longueur() * hauteur();
	 }
	
	 public boolean contient(PointR2 p) {
	     return ( p.x <= ext2.x && p.x >= ext1.x) && (p.y >= ext1.y && p.y <= ext2.y);
	 }
}

public class MainTestEx_1 {
	 public static void main(String[] args) {
	    
	     PointR2 point1 = new PointR2(2.0, 3.0);
	     PointR2 point2 = new PointR2(4.0, 5.0);
	
	     System.out.println("Distance entre les points : " + point1.distance(point2));
	     System.out.println("Points égaux : " + point1.equals(point2));
	     System.out.println("Représentation du point : " + point1.toString());
	
	    
	     Rectangle rectangle1 = new Rectangle(point1, point2);
	     System.out.println("Longueur du rectangle : " + rectangle1.longueur());
	     System.out.println("Hauteur du rectangle : " + rectangle1.hauteur());
	     System.out.println("Périmètre du rectangle : " + rectangle1.perimetre());
	     System.out.println("Surface du rectangle : " + rectangle1.surface());
	     System.out.println("Contient le point (3.0, 4.0) : " + rectangle1.contient(new PointR2(3.0, 4.0)));
	
	     Rectangle rectangle2 = new Rectangle(new PointR2(), new PointR2(1.0, 1.0));
	     System.out.println("Longueur du rectangle2 : " + rectangle2.longueur());
	     System.out.println("Hauteur du rectangle2 : " + rectangle2.hauteur());
	     System.out.println("Périmètre du rectangle2 : " + rectangle2.perimetre());
	     System.out.println("Surface du rectangle2 : " + rectangle2.surface());
	     System.out.println("Contient le point (0.5, 0.5) : " + rectangle2.contient(new PointR2(0.5, 0.5)));
	 }
}
