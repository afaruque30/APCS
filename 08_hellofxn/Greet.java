public class Greet {
	public static void greet(String input){
		System.out.printf("Why, hello there, %s. How do you do?", input);
	}
	public static void main(String[] args) {
		number=(int)(Math.random());
		if (number == 0){
			greet("Russel");
		}else if(number==1){
			greet("Kevin");
		}else{
			greet("joe");
		}
	}
}
/* 
Discoveries-Main function can call helper function. In this case, the main function calls greet.
Unresolved Questions- is there any other way to do this, and am I even doing it right.
*/
