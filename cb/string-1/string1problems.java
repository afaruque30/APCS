// Team solobozo: Abdullah Faruque
// APCS
// HW28: PPMP
// 2021-10-29
// time spent- 0.2 hour

/*
DISCO: you have to make each method static to test them out, even though static isn't present in the coding bat coding place thingy.
QCC: ...
*/

public class string1problems{

public static void main(String[] args){
	System.out.println("cases for helloName");
	System.out.println(helloName("Hello Bob"));
	System.out.println(helloName("Hello Joe"));
	System.out.println(helloName("Hello Mama"));
	System.out.println("\n");
	System.out.println("cases for makeAbba");
	System.out.println(makeAbba("Hello", "Mama"));
	System.out.println(makeAbba("joe", "Mama"));
	System.out.println(makeAbba("ok", "and"));
	
}

public static String helloName(String name) {
  return ("Hello " + name + "!");
	}

public static String makeAbba(String a, String b) {
  		return (a+b+b+a);
	}	
}
