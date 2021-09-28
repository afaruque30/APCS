import java.util.Scanner;

public class chapter6ex3 {
	public static boolean isTriangle(int a, int b, int c) {
		return a+b>c && a-b<c ;
	}
	public static void main(String[]arg) {
		System.out.println(isTriangle(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt(), (new Scanner(System.in).nextInt())));
	}
}