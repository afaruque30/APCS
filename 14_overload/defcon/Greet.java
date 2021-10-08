/*
ABdullah Faruque + Green Lantern, Jonathan + Phoenix, Oscar + Redhead
APCS
HW14: Customize Your Creation
2021-10-07
*/
/**
DISCO
The output would consist of four sentences of "word up xxxx" xxxx being the input of freshman, dr.spaceman, kong fooey, or mom.
QCC
is it possible to make this have the same output as the other greet function for overcon. 
*/

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


