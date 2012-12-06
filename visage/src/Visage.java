/**
 * Creation d'un visage � l'aide d'objet geom�trique simple.
 * @version 1.0
 * @author Ga�tan Duvaux
 *
 */
public class Visage {

	public static void main(String[] args) {
		Point y1 = new Point(-1,1);
		Point y2 = new Point(y1);
		Point n = new Point(0,0);
		Cercle v = new Cercle();
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Segment b = new Segment();
		Point p1 = new Point(-2,0);
		Point p2 = new Point(-3,0);
		Point p3 = new Point(-2,1);
		
		y2.symetrie(false, true);
		v.setCentre(n);
		v.setRayon(2);
		t1.setP1(p1);
		t1.setP2(p2);
		t1.setP3(p3);
		System.out.println("La premi�re oreille � ses points en :" + t1);
		t2 = new Triangle(t1.symetrie(false, true));
		b.setP1(-1, -1);
		b.setP2(1, -1);
		System.out.println("L'oeil droit se situe � " + y1);
		System.out.println("L'oeil gauche se situe � " + y2);
		System.out.println("Le nez se situe �" + n);
		System.out.println("Le visage � son centre en  " + v.getCentre() + " " + " et un rayon de " + v.getRayon());
		System.out.println("La bouche se situe en " + b.getP1() + " " + b.getP2() + " et a une longueur de " + b.longueur());
		System.out.println("La deuxi�me oreille � ses points en " + t2);
	}
}
