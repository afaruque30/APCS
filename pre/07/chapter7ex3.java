public class chapter7ex3 {
	public static double powerrecursive(double x, int n) {
		if( n==0 ) {
			return 1.0;
		} else {
			return x*powerrecursive(x, n-1);
		}
	}
	
	public static double poweritter(double x, int n) {
		double answer = 1;
		for( int a = 0; a<n; a++){
			answer = answer*x;
		}
		return answer;
	}
	
	public static void main(String[]arg) {
		System.out.println( powerrecursive(2,3));
		System.out.println( poweritter(2,3));
		
	}
}