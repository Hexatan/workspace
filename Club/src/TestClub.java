public class TestClub {
	public static void main(String[] args) {
		Club c1 = new Club();
		c1.init();
		Club c2 = new Club(c1);
		c2.Releve();
	}
}
