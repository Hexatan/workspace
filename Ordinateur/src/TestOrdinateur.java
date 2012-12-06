
public class TestOrdinateur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ordinateur o1 = new Ordinateur();
		Ordinateur o2 = new Ordinateur();
		o2.init();
		System.out.println(o2.getFrequence());
		System.out.println(o2.getMarqueEcran());
		System.out.println(o2.getMarqueProcesseur());
		System.out.println(o2.getTailleEcran());
		System.out.println(o2);
		


	}

}
