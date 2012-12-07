import java.util.ArrayList;
import java.util.Arrays;

public class Club {
	private String nomClub;
	private ArrayList<Personne> adherents;
	
public Club() {}
	
public Club(String unNomClub, ArrayList<Personne> desAdherents) {
		this.nomClub = unNomClub;
		adherents = new ArrayList<Personne>();
		for(int i=0;i<(desAdherents.size());i++) {
			adherents.set(i, desAdherents.get(i));
		}
	}
	
	public Club(Club c) {
		this.nomClub = c.nomClub;
		this.adherents = new ArrayList<Personne>();
		int l = c.adherents.size();
		for(int i=0;i<l;i++){
			if(c.adherents.get(i) instanceof Salarie) {
				this.adherents.set(i, new Salarie((Salarie) c.adherents.get(i)));
			}
			else if(c.adherents.get(i) instanceof Etudiant) {
				this.adherents[i] = new Etudiant((Etudiant) c.adherents.get(i));
			}
			else this.adherents[i] = new Personne(c.adherents.get(i));
		}
	}
	
	public String getNomClub() {
		return nomClub;
	}
	
	public ArrayList<Personne> getAdherents() {
		return adherents;
	}

	public void init(){
		this.nomClub = Lire.jstring("Nom ?");
		int na=Lire.jint("Nbre adh�rents ?"),i = 0;
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
		return "nomClub=" + nomClub + ", adherents="
				+ Arrays.toString(adherents) + "]";
	}
	
	public void Releve(){
		int i;
		int max = 0;
		for(i=0;i<adherents.length;i++){
			if(adherents.get(i).nom.length() > max) max = adherents[i].nom.length();
			if(adherents.get(i) instanceof Salarie)
				if(((Salarie) adherents.get(i)).getEmployeur().length() > max)
					max = ((Salarie) adherents.get(i)).getEmployeur().length();
			if(adherents.get(i) instanceof Etudiant)
				if(((Etudiant) adherents.get(i)).getFaculte().length() > max)
					max = ((Etudiant) adherents.get(i)).getFaculte().length();
		}
		Graph.tr(max*5);
		Graph.sdl(1);
		Graph.sop(Graph.sp((int)((max*5)/2)-(this.nomClub.length()/2)));
		Graph.sop(this.nomClub);Graph.sdl(1);
		Graph.tr(max*5);Graph.sopn("\nNombre d'adh�rents : " + this.adherents.length);
		Graph.trsdl(max*5);
		String s0b = Graph.justifie(Graph.justifie(Graph.justifie(Graph.justifie(
				"Type", max, "Nom"), max+10, "Age"), max+15, "Fac"),max+30,"NumeroEtu");
		String s0 = Graph.justifie(Graph.justifie("", max+15, "Employeur"),max+30,"NumeroSecu");
		Graph.sopn(s0);
		Graph.sopn(s0b);
		Graph.trsdl(max*5);
		for(i=0;i<adherents.length;i++) {
			String str = ("" + (adherents.get(i).getClass())).substring(6);
			String s1 = Graph.justifie(
					Graph.justifie(str, max, adherents.get(i).nom), max+10, "" + adherents.get(i).age);
			if(adherents.get(i) instanceof Etudiant) {
				String str2 = ((Etudiant)adherents.get(i)).getFaculte();
				String str3 = ((Etudiant)adherents.get(i)).getNumeroEtudiant();
				String s2 = Graph.justifie(Graph.justifie(s1, max+15, str2), max+30, str3);
				Graph.sop(s2);
			}
			else if(adherents.get(i) instanceof Salarie) {
				String str4 = ((Salarie)adherents.get(i)).getEmployeur();
				String str5 = ((Salarie)adherents.get(i)).getNumeroSecu();
				String s3 = Graph.justifie(Graph.justifie(s1, max+15, str4), max+30, str5);
				Graph.sop(s3);
			}
			else if(adherents.get(i) instanceof Personne) Graph.sop(s1);
			Graph.sdl(1);
			Graph.trsdl(max*5);
		}
	}
	
	public void ajouterAd(Personne p){
		int l = adherents.length;
		Personne[] temp = new Personne[l+1];
		for(int i=0;i<l;i++) temp[i] = adherents.get(i);
		adherents = new Personne[l+1];
		for(int i=0;i<l;i++) adherents[i] = temp[i];
		adherents[l] = p;
	}
	
	public void ajouterTab(Personne[] tp) {
		int l = adherents.size();
		int l2 = tp.length;
		Personne[] temp = new Personne[l+l2];
		for(int i=0;i<l;i++) temp[i] = adherents.get(i);
		adherents = new Personne[l+l2];
		for(int i=0;i<l;i++) adherents[i] = temp[i];
		for(int i=(l);i<(l+l2);i++) adherents[i] = tp[i-l];
	}
}