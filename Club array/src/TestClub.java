import java.util.ArrayList;

public class TestClub {
	public static void main(String[] args) {
		Personne p = new Personne("nom",56);
		Salarie s = new Salarie("sevnjkn", 26, "4543153", "hjvbhjv");
		ArrayList<Personne> l = new ArrayList<Personne>();
		l.add(p);
		l.add(s);
		Club c1 = new Club("Alpha",l);
		c1.Releve();
	}
}