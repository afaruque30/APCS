/*
ABdullah Faruque + Green Lantern
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
*/
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
	
	BigSib joe = new BigSib();
	joe.setHelloMsg("Salutations");
	
	greeting= joe.greet("Dr. Spaceman");
	System.out.println(greeting);
	
	BigSib mama = new BigSib();
	mama.setHelloMsg("Hey ya");
	
	greeting= mama.greet("Kong Fooey");
	System.out.println(greeting);
	
	BigSib sky = new BigSib();
	sky.setHelloMsg("Sup");
	
	greeting= sky.greet("Mom");
	System.out.println(greeting);

  } //end main()
} //end Greet
/**
DISCO
you can create multiple bigsibs since it is not static, which allows you to create the message. 
QCC
is there a point in doing this homework this way/are there other ways to achieve this end result?
*/
