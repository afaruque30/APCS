public class chapter8ex1part1{
	public static double[] powArray(double[] a, int power) {
		double[] b = new double[a.length];
		for (int i=0; i<a.length;i++){
			b[i]= Math.pow(a[i],power);
		}
		return b;
	}
	public static void main( String[] arg ) {
		double[] b = {1.0,2.0,3.0,4.0,5.0,6.0};
		System.out.println( powArray(b,2);
	}
}