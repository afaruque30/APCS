/*
ABdullah Faruque + Green Lantern
APCS
HW13: Where do BigSibs Come From?
2021-10-06
*/
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
	
	BigSib joe = new BigSib("Salutations");
	
	greeting= joe.greet("Dr. Spaceman");
	System.out.println(greeting);
	
	BigSib mama = new BigSib("Hey ya");
	
	greeting= mama.greet("Kong Fooey");
	System.out.println(greeting);
	
	BigSib sky = new BigSib("sup");
	
	greeting= sky.greet("Mom");
	System.out.println(greeting);

  } //end main()
} //end Greet
/**
DISCO
The use of constructors has reduced the length of the code by alot, and its easier to understand in my opinion. 
QCC
in what scenario would you not use a constructor to do this type of task?
*/
