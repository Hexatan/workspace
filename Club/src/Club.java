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
		Graph.tr(50);
		Graph.sop("\n" + this.nomClub + "\n");
		Graph.tr(50);
		Graph.sop("\n" + this.adherents.length + "\n");
		Graph.tr(50);
		Graph.sdl(1);
		Graph.sop("\n" + );
		for(i=0;i<adherents.length;i++) {
			Graph.sop(adherents[i].getClass() + "    " +
					adherents[i].nom + "    " + 
					adherents[i].age + "    ");
			if(adherents[i] instanceof Etudiant) {
				Graph.sop(((Etudiant)adherents[i]).getFaculte()+ "    " +
						((Etudiant)adherents[i]).getNumeroEtudiant());
			}
			else if(adherents[i] instanceof Salarie) {
				Graph.sop(((Salarie)adherents[i]).getEmployeur()+ "    " +
						((Salarie)adherents[i]).getNumeroSecu());
			}
			Graph.sdl(1);
			Graph.tr(50);
			Graph.sdl(1);
		}
	}
	
}
