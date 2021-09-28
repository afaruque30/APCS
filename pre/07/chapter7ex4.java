public class chapter7ex4 {
	public static int factorialR(int x) {
		if( x==0 ) {
			return 1;
		} else {
			return x * factorialR(x-1);
		}
	}
	
	public static int factorialI(int x) {
		int answer = 1;
		for( int a=1; a<=x; a++){
			answer = answer*a;
		}
		return answer;
	}
	
	public static void main(String[]arg) {
		System.out.println(factorialR(3));
		System.out.println(factorialI(3));
		
	}
}