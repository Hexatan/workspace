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
	
	public static void sp(int n) {
		for(int i = 1;i<n;i++) System.out.print(Graph.ce);
	}
	
	public static void sop(String str) {
		System.out.print(str);
	}
	
	public static void sopn(String str) {
		System.out.print(str);
	}
}
