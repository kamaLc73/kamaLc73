package bus;

public class Calculer implements CreditInterface{
	public Calculer() {
	}

	@Override
	public double calculerMensualite(int n, double c, double t) {
		return (c*(t/12))/(1- Math.pow((1+t/12), -n));
	}
}
