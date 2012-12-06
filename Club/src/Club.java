import java.util.Arrays;

public class Club {
	private String nomClub;
	private Personne[] adherents;
	
	public Club() {}
	
	public Club(String unNomClub, Personne[]desAdherents) {
		this.nomClub = unNomClub;
		adherents = new Personne[desAdherents.length];
		for(int i=0;i<(desAdherents.length);i++) {
			adherents[i] = desAdherents[i];
		}
	}
	
	public Club(Club c) {
		this.nomClub = c.nomClub;
		this.adherents = c.adherents.clone();
		int l = c.adherents.length;
		for(int i=0;i<l;i++){
			if(c.adherents[i] instanceof Salarie) {
				this.adherents[i] = new Salarie((Salarie) c.adherents[i]);
			}
			else if(c.adherents[i] instanceof Etudiant) {
				this.adherents[i] = new Etudiant((Etudiant) c.adherents[i]);
			}
			else this.adherents[i] = new Personne(c.adherents[i]);
		}
	}
	
	public String getNomClub() {
		return nomClub;
	}
	
	public Personne[] getAdherents() {
		return adherents;
	}
	
	public void init(){
		this.nomClub = Lire.jstring("Nom ?");
		int na=Lire.jint("Nbre adhérents ?"),i = 0;
		this.adherents = new Personne[na];
		String c="";
		while(i!=na) {
			do {
				c = Lire.jstring("C ?");
				if(c.equalsIgnoreCase("salarie")) {
					this.adherents[i] = new Salarie();
					this.adherents[i].init();
				}
			
				else if(c.equalsIgnoreCase("etudiant")) {
					this.adherents[i] = new Etudiant();
					this.adherents[i].init();
				}
				
				else if(c.equalsIgnoreCase("aucun")) {
					this.adherents[i] = new Personne();
					this.adherents[i].init();
				}
			}
			while((c.equalsIgnoreCase("salarie")==false)&&
					(c.equalsIgnoreCase("etudiant")==false)&&
					(c.equalsIgnoreCase("aucun")==false));
			i++;
		}
	}
	
	public String toString() {
		return "Club [nomClub=" + nomClub + ", adherents="
				+ Arrays.toString(adherents) + "]";
	}
	
	public void Releve(){
		int i;
		int max =0;
		for(i=0;i<adherents.length;i++){
			if(adherents[i].nom.length() > max) max = adherents[i].nom.length();
			if(adherents[i] instanceof Salarie)
				if(((Salarie) adherents[i]).getEmployeur().length() > max)
					max = ((Salarie) adherents[i]).getEmployeur().length();
			if(adherents[i] instanceof Etudiant)
				if(((Etudiant) adherents[i]).getFaculte().length() > max)
					max = ((Etudiant) adherents[i]).getFaculte().length();
		}
		Graph.tr((int) (max*4.5));Graph.sopn("\n" + this.nomClub);
		Graph.tr((int) (max*4.5));Graph.sopn("\n" + this.adherents.length);
		Graph.tr((int) (max*4.5));Graph.sdl(1);
		String s0b = Graph.justifie(
					Graph.justifie(
						Graph.justifie(
							Graph.justifie("Type", max, "Nom"), max+10, "Age"), max+15, "Fac"),max+30,"NumeroEtu");
		String s0 = Graph.justifie(Graph.justifie("", max+15, "Employeur"),max+30,"NumeroSecu");
		Graph.sopn(s0);
		Graph.sop(s0b);
		for(i=0;i<adherents.length;i++) {
			String str = ("" + (adherents[i].getClass())).substring(6);
			String s1 = Graph.justifie(
					Graph.justifie(str, max, adherents[i].nom), max+10, "" + adherents[i].age);
			if(adherents[i] instanceof Etudiant) {
				String str2 = ((Etudiant)adherents[i]).getFaculte();
				String str3 = ((Etudiant)adherents[i]).getNumeroEtudiant();
				String s2 = Graph.justifie(Graph.justifie(s1, max+15, str2), max+30, str3);
				Graph.sop(s2);
			}
			else if(adherents[i] instanceof Salarie) {
				String str4 = ((Salarie)adherents[i]).getEmployeur();
				String str5 = ((Salarie)adherents[i]).getNumeroSecu();
				String s3 = Graph.justifie(Graph.justifie(s1, max+15, str4), max+30, str5);
				Graph.sop(s3);
			}
			Graph.sdl(1);
			Graph.tr((int) (max*4.5));
			Graph.sdl(1);
		}
	}
}