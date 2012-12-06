
public class TestFraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,3);
		Fraction f2 = new Fraction(f1);
		Fraction f3 = new Fraction(4,6);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		f2.setNum(4);
		if(f1.egaleAbis(f3)) {
			System.out.println("Les fractions " + f1 +" et " + f3 + " sont égales");
		}
		else {
			System.out.println("Les fractions " + f1 +" et " + f3 + " ne sont pas égales");
		}
		Fraction f4 = new Fraction();
		f4 = f1.inverse();
		System.out.println(f4);
		System.out.println(f1);
		System.out.println(f1.ajoute(f4));
		Fraction f5 = new Fraction();
		f5 = f1.multiplie(f2);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f5);
		f3.simplifier();
		System.out.println(f3);
	}

}
