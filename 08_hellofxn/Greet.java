public class Greet {
	public static void greet(String input){
		System.out.printf("Why, hello there, %s. How do you do? \n", input);
	}
	public static void main(String[] args) {
		greet("Kevin");
		greet("Abdullah");
		greet("Russel");
	}
}
/* 
Discoveries-Main function can call helper function. In this case, the main function calls greet.
Unresolved Questions- is there any other way to do this, and am I even doing it right.
*/
