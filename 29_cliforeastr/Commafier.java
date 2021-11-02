//Julia Kozak, Joshua Yagupsky, Abdullah Faruque
//APCS
//HW29 -- Which Way Do You Roll?
//2021-11-01
//Time spent: 0.9hrs

/*
DISCO: Integer.parseInt(<string>) turns a string representation of an integer into an integer
       Arrays: you can define the values of each term in an array using a for loop
               the main method takes an array of Strings called args
QCC: 
*/

public class Commafier {
    public static String commafyF(int n) {
        String strN=Integer.toString(n);
        for(int i=strN.length()-3;i>0;i-=3){
           strN=(strN.substring(0,i)+","+strN.substring(i,strN.length()));
        }
        return strN;
    }
    public static String commafyR(int n){
        String strN=Integer.toString(n);
        if (strN.length()<=3){
            return strN;
        } else {
            return commafyR(Integer.parseInt(strN.substring(0,strN.length()-3)))+","+strN.substring(strN.length()-3);
        }
    }
    public static void main(String[] args){
		for(String i : args){
			System.out.println(commafyF(Integer.parseInt(i)));
			System.out.println(commafyR(Integer.parseInt(i)));
		}
    }
}