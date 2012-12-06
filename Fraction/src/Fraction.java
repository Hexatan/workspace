
public class Fraction {
	private int num;
	private int den;
	
	public Fraction() {
		this.setNum(0);
		this.setDen(0);
	}
	
	public Fraction(int num,int den) {
		this.setNum(num);
		this.setDen(den);
	}
	
	public Fraction(Fraction f) {
		this(f.getNum(),f.getDen());
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public void init() {
		this.setNum(Lire.jint("Veuillez saisir le numérateur"));
		do
			this.setDen(Lire.jint("Veuillez saisir le dénominateur"));
		while(this.getDen() == 0);
	}
	
	public String toString() {
		return this.getNum() + "/" + this.getDen();
	}
	
	public boolean egaleA(Fraction f) {
		if(this.getNum() == f.getNum() && this.getDen() == f.getDen()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean egaleAbis(Fraction f) {
		return this.getNum()*f.getDen() == this.getDen() * f.getNum();
	}
	
	public boolean egaleATri(Fraction f) {
		return this.simplifier() == f.simplifier();
	}
	
	public Fraction inverse() {
		return new Fraction(this.getDen(),this.getNum());
	}
	
	public Fraction ajoute(Fraction f) {
		return new Fraction((this.getNum()*f.getDen())+(f.getNum()*this.getDen()),(this.getDen()*f.getDen())).simplifier();
	}
	
	public Fraction multiplie(Fraction f) {
		return new Fraction((this.getNum()*f.getNum()),(this.getDen()*f.getDen())).simplifier();
	}
	
	public Fraction simplifier() {
		int a = this.getNum(),b = this.getDen(),PGCD = 1;
		while(a!=b) {
			if(a<b) {
				int tmp =a;
				a=b;
				b=tmp;
			}
			int c = a-b;
			a = c;
			PGCD = a;
		}
		this.setNum(this.getNum()/PGCD);
		this.setDen(this.getDen()/PGCD);
		return this;
	}
	
	public Fraction divise(Fraction f) {
		return new Fraction(this.multiplie(f.inverse())).simplifier();
	}
}
