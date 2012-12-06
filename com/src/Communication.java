public class Communication {
	private float duree;
	private String numero;
	public static final float PRIX_SECONDE = 0.01f;
	
	public Communication(){ }
	public Communication(float d, String num) {
		this.duree = d;
		this.numero = num;
	}
	
	public Communication(Communication c) {
		this(c.duree,c.numero);
	}
	
	public float getDuree() {
		return duree;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String toString() {
		return "Communication [duree=" + duree + ", numero=" + numero + "]";
	}
	
	public void init() {
		this.duree = Lire.jfloat();
		this.numero = Lire.jstring();
	}
	
	public float prixCommunication() {
		return this.duree*Communication.PRIX_SECONDE;
	}
}
