public class chapter8ex4{
	
	public static int indexofMAX(int[] a) {
		int maxvalue= 0;
		int indexofmax=0;
		for (int i=0; i<a.length ; i++) {
			if(a[i]>maxvalue){
				maxvalue=a[i];
				indexofmax=i;
			}
		}
		return indexofmax;
	}
	public static void main( String[] arg ) {
		int[] b = {1,2,3,4,5,6};
		System.out.println(indexofMAX(b));
	}
}