public class Graph {
	
	public static char csdl = '\n';
	public static char ct = '_';
	public static char ce = ' ';
	
	public static void sdl(int n) {
		for(int i = 0;i<n;i++) System.out.print(Graph.csdl);
	}
	
	public static void tr(int n) {
		for(int i = 1;i<n;i++) System.out.print(Graph.ct);
	}
	
	public static String sp(int n) {
		String str = "";
		for(int i = 1;i<n;i++) str += Graph.ce;
		return str;
	}
	
	public static void sop(String str) {
		System.out.print(str);
	}
	
	public static void sopn(String str) {
		System.out.print(str);
	}
	
	public static String justifie(String av, int n, String str) {
		int nbe = 0;
		if(av.length()>=n) n = av.length()+1;
		else {nbe = n - av.length();}
		return av + Graph.sp(nbe) + str;
	}
}
