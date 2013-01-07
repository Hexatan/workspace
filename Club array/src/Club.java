import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Club {
	private String nomClub;
	private ArrayList<Personne> adherents;
	
	/**
	 * Constructeur par d�faut.
	 */
	public Club() {}
	
	/**
	 * Constructeur avec un nom et une liste d'adh�rents.
	 * @param unNomClub Nom du club
	 * @param desAdherents Liste des adh�rents
	 */
	public Club(String unNomClub, ArrayList<Personne> desAdherents) {
		this.nomClub = unNomClub;
		adherents = new ArrayList<Personne>();
		for(int i=0;i<(desAdherents.size());i++) {
			adherents.add(desAdherents.get(i));
		}
	}
	/**
	 * Constructeur par copie.
	 * @param c Club que l'on veut copier
	 */
	public Club(Club c) {
		this.nomClub = c.nomClub;
		this.adherents = new ArrayList<Personne>();
		int l = c.adherents.size();
		for(int i=0;i<l;i++){
			if(c.adherents.get(i) instanceof Salarie) {
				this.adherents.add(new Salarie((Salarie) c.adherents.get(i)));
			}
			else if(c.adherents.get(i) instanceof Etudiant) {
				this.adherents.add(new Etudiant((Etudiant) c.adherents.get(i)));
			}
			else this.adherents.add(new Personne(c.adherents.get(i)));
		}
	}
	
	/**
	 * Retourne la nom du club.
	 * @return NomClub
	 */
	public String getNomClub() {
		return nomClub;
	}
	
	/**
	 * Retourne la liste des adh�rents.
	 * @return adherents
	 */
	public ArrayList<Personne> getAdherents() {
		return adherents;
	}
	
	/**
	 * M�thode qui initialise int�ractivement le club.
	 */
	public void init(){
		this.nomClub = Lire.jstring("Nom ?");
		int na=Lire.jint("Nbre adh�rents ?"),i = 0;
		this.adherents = new ArrayList<Personne>();
		String c="";
		while(i!=na) {
			do {
				c = Lire.jstring("C ?");
				if(c.equalsIgnoreCase("salarie")) {
					this.adherents.set(i, new Salarie());
					this.adherents.get(i).init();
				}
			
				else if(c.equalsIgnoreCase("etudiant")) {
					this.adherents.set(i, new Etudiant());
					this.adherents.get(i).init();
				}
				
				else if(c.equalsIgnoreCase("personne")) {
					this.adherents.set(i, new Personne());
					this.adherents.get(i).init();
				}
			}
			while((c.equalsIgnoreCase("salarie")==false)&&
					(c.equalsIgnoreCase("etudiant")==false)&&
					(c.equalsIgnoreCase("personne")==false));
			i++;
		}
	}
	
	/**
	 * Trie la liste des adh�rents en fonction de leur type.
	 */
	@SuppressWarnings("unchecked")
	public void trie() {
		 Collections.sort(adherents);
	}
	
	/**
	 *M�thode toString qui retourne le nom du club et la liste des adh�rents.
	 */
	public String toString() {
		this.trie();
		return "nomClub=" + nomClub + ", adherents="
				+ Arrays.asList(adherents);
	}
	
	/**
	 * M�thode qui affiche de fa�on propre toutes les informations sur le club.
	 */
	public void Releve(){
		this.trie();
		int i;
		int max = 0;
		for(i=0;i<adherents.size();i++){
			if(adherents.get(i).nom.length() > max) max = adherents.get(i).nom.length();
			if(adherents.get(i) instanceof Salarie)
				if(((Salarie) adherents.get(i)).getEmployeur().length() > max)
					max = ((Salarie) adherents.get(i)).getEmployeur().length();
			if(adherents.get(i) instanceof Etudiant)
				if(((Etudiant) adherents.get(i)).getFaculte().length() > max)
					max = ((Etudiant) adherents.get(i)).getFaculte().length();
		}
		Graph.tr(max*5);
		Graph.sdl(1);
		Graph.sop(Graph.centre(this.nomClub,(max*5)));Graph.sdl(1);
		Graph.tr(max*5);Graph.sopn("\nNombre d'adh�rents : " + this.adherents.size());
		Graph.trsdl(max*5);
		String s0b = Graph.justifie(Graph.justifie(Graph.justifie(Graph.justifie(
				"Type", max, "Nom"), max+10, "Age"), max+15, "Fac"),max+30,"NumeroEtu");
		String s0 = Graph.justifie(Graph.justifie("", max+15, "Employeur"),max+30,"NumeroSecu");
		Graph.sopn(s0);
		Graph.sopn(s0b);
		Graph.trsdl(max*5);
		for(i=0;i<adherents.size();i++) {
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
	
	/**
	 * M�thode qui ajoute une personne � la liste.
	 * @param p personne que l'on veut ajouter
	 */
	public void ajouterAd(Personne p){
		this.adherents.add(p);
	}
	
	/**
	 * M�thode qui ajoute un tableau de personnes � la liste.
	 * @param tp tableau de personnes que l'on veut ajouter
	 */
	public void ajouterTab(Personne[] tp) {
		int l = tp.length;
		for(int i=0;i<l;i++) this.adherents.add(tp[i]);
	}
	
	/**
	 * M�thode qui ajoute une liste de personne � la liste.
	 * @param lp liste de personne que l'on veut ajouter
	 */
	public void ajouteList(ArrayList<Personne> lp) {
		this.adherents.addAll(lp);
	}
}