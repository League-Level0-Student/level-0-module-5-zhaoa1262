
public class Fibonacci {
public static void main(String[] args) {
	int o = 0;
	int m = 1;
	

	
	for(int i =0; i<12; i++) {
		System.out.println(o);
	int g = o + m;
	o=m;
	m=g;
	
	}
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
}
}
