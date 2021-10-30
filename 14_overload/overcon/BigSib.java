/*
ABdullah Faruque + Green Lantern, Jonathan + Phoenix, Oscar + Redhead
APCS
HW14: Customize Your Creation
2021-10-07
*/
public class BigSib {
	public String helloMsg;
	
	public BigSib(){
		helloMsg= "Word up";
	}
	public BigSib(String input){
		helloMsg=input;
	}
	public String greet(String input){
		return helloMsg  + " " + input ;
	}
}

public class Greet {
    public static void main(String[] args) {
        String greeting;

        BigSib richard = new BigSib("Word up");
        BigSib grizz = new BigSib("Hey ya");
        BigSib dotCom = new BigSib("Sup");
        BigSib tracy = new BigSib("Salutations");

        greeting = richard.greet("freshman");
        System.out.println(greeting);

        greeting = tracy.greet("Dr. Spaceman");
        System.out.println(greeting);

        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);

        greeting = dotCom.greet("mom");
        System.out.println(greeting);
    } // end main()
} // end Greet
/*
Disco
constructors remove steps in the process by giving meaning to a variable upon creation. 
QCC
none atm
*/

public class BigSib {
	public String helloMsg;
	
	public BigSib(String input){
		helloMsg= "Word up" //constructor 
	}
	public String greet(String input){
		return helloMsg  + " " + input ;
	}
}


public class Greet {
    public static void main(String[] args) {
        String greeting;

        BigSib richard = new BigSib();
        BigSib grizz = new BigSib();
        BigSib dotCom = new BigSib();
        BigSib tracy = new BigSib();

        greeting = richard.greet("freshman");
        System.out.println(greeting);

        greeting = tracy.greet("Dr. Spaceman");
        System.out.println(greeting);

        greeting = grizz.greet("Kong Fooey");
        System.out.println(greeting);

        greeting = dotCom.greet("mom");
        System.out.println(greeting);
    } // end main
} // end Greet
