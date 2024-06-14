// import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test {
	
	public static void main(String[] args) {
		new Test();
	}
	

	void exp01() {
		Carre c = new Carre(3);
		System.out.println(c.surface());
		Rectangle r = new Rectangle(3, 4);
		System.out.println(r.surface());
		Cercle cr = new Cercle(3);
		System.out.println(cr.surface());
	}
	
	void exp02() {
		Forme c = new Carre(3);
		System.out.println(c.surface());
		Forme r = new Rectangle(3, 4);
		System.out.println(r.surface());
		Forme cr = new Cercle(3);
		System.out.println(cr.surface());
	}
	void exp03() {
		List<Forme> forms = new Vector<>();
		forms.add(new Cercle(3));
		forms.add(new Rectangle(2, 3));
		forms.add(new Carre(3));
		Dessin d = new Dessin(forms);
		System.out.println(d.surfaceTotal());
	}

	void exp04() {
		Dessin d = new Dessin();
		d.ajouter(new Cercle(3));
		d.ajouter(new Rectangle(2, 3));
		d.ajouter(new Carre(3));
		System.out.println(d.surfaceTotal());
		d.ajouter(new Cercle(4));
		System.out.println(d.surfaceTotal());
	}

	public Test(){
		exp04();
	}
}
