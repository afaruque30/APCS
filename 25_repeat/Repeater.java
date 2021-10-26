// Team Wires:  Abdullah Faruque, Julia Kozak, Joshua Yagupsky
// APCS
// HW25: Do I repeat myself?
// 2021-10-26
// time spent- 0.2 hours

/*
DISCO: recursive process involves establishing a base case, and calling a function inside itself. 
QCC: which function below is better?
*/

public class Repeater {
	
	public static void fenceW(int numPosts){
		int counter=1;
		int max=numPosts;
		while(counter<max){
			System.out.print("|--");
			counter++;
		}
		System.out.print("|\n");
	}

	public static void fenceR(int numPosts){
		int n = numPosts;
		if (n==1){
			System.out.print("|\n");
		} else{
			System.out.print("|--");
			fenceR(n-1);
		}
	}
	
	
	public static void main(String[] args){
		System.out.println("fenceW in action...");
		fenceW(1);
		fenceW(2);
		fenceW(3);
		System.out.println("fenceR in action...");
		fenceR(1);
		fenceR(2);
		fenceR(3);
	}
}
