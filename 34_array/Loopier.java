/*
* Team Green -- Abdullah Faruque, Neil Lin, Russell Goychayev 
* APCS
* HW34: A Pirate's Life for Me
* 2021-11-12
* time spent: 1 hr

* DISC-
* QCC-
*/

public class Loopier{
	
	public static void generateArray(int[] a){
		for(int i=0; i<a.length;i++){
			a[i]=(int)(Math.random()*10);
		}
	}
	
	public static String arrayToString(int[] a){
		String output = "";
		for(int i:a){
			output+=String.valueOf(i) + " ";
		}
		return output;
	}
	
	public static int linSearch(int[] a, int target){
		for(int i=0;i<a.length;i++){
			if (a[i]==target) return i;
		}
		return -1;
	}
	
	public static int freq(int[] a, int target){
		int counter=0;
		for(int i=0;i<a.length;i++){
			if (a[i]==target){
				counter++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args){
		int[] array = new int[10];
		generateArray(array);
		System.out.println(arrayToString(array));
		System.out.println(linSearch(array,5));
		System.out.println(freq(array,5));
		
	}
}