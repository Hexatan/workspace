import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Long> op = new ArrayList<Long>();
		long ip = 1;
		for(long i = 1;i>0;i++) {
			op.add(i);
			op.add(i%ip);
			System.out.println(i);
			ip=i;
		}
	}
}
