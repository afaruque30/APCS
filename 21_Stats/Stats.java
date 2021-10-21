// Abdullah Faruque, Julia Kozak, Joshua Yagupsky (Team Wires)
// APCS
// HW21: STAtisTically Speaking...
// 2021-10-20

/*
DISCO: instead of Math.sqrt(), one can use Math.pow(a,(1.0/2.0)) and for cube roots, you can do Math.pow(a,(1.0/3.0)).
QCC: how would you not typecast for int geoMean... because Math.sqrt and Math.pow(a,(1.0/3.0)) would not return ints. 
*/

public class Stats {

  public static int mean(int a, int b) {
	  return (((b-a)/2)+a);
  }

  public static double mean(double a, double b) {
	  return (((b-a)/2)+a);
  }

  public static int max(int a, int b) {
	  if(a>=b){
		  return a;
	  } else{
		  return b;
  }
  }

  public static double max(double a, double b) {
	  if(a>=b){
		  return a;
	  } else{
		  return b;
  }
  }

  public static int geoMean(int a, int b) {
	  return (int)((Math.pow((a/1.0),(1.0/2.0)))*(Math.pow((b/1.0),(1.0/2.0))));
  }

  public static double geoMean(double a, double b) {
	  if(a>=0 && b>=0){
		  return ((Math.sqrt(a))*(Math.sqrt(b)));
	  }
	  else {
		  return Math.sqrt(a*b);
	  }
  }

  public static int max(int a, int b, int c) {
	  if(a>=b){
		  if(a>=c){
			  return a;
		  }
		  else{
			  return c;
		  }
	  }
	  else{
		  if(b>=c){
			  return b;
		  }
		  else{
			  return c;
	  }
  }
  }

  public static double max(double a, double b, double c) {
	  if(a>=b){
		  if(a>=c){
			  return a;
		  }
		  else{
			  return c;
		  }
	  }
	  else{
		  if(b>=c){
			  return b;
		  }
		  else{
			  return c;
	  }
  }
  }

  public static int geoMean(int a, int b, int c) {
	  return (int)((Math.pow(a,(1.0/3.0)))*(Math.pow(b,(1.0/3.0)))*(Math.pow(c,(1.0/3.0))));
  }

  public static double geoMean(double a, double b, double c) {
      return ((Math.pow(a,(1.0/3.0)))*(Math.pow(b,(1.0/3.0)))*(Math.pow(c,(1.0/3.0))));
  }


  //main method for testing functionality
  public static void main( String[] args ) {
	System.out.println(Stats.mean(15,15)); //Should be 15
    System.out.println(Stats.mean(10,11)); //Should be 10
    System.out.println(Stats.mean(1500000000,1500000000)); //Should be 1500000000
    System.out.println(Stats.mean(10.0,11.0)); //Should be 10.5
    System.out.println(Stats.max(-2,2)); //Should be 2
    System.out.println(Stats.max(-2147483648,2147483647)); //Should be the bigger one
    System.out.println(Stats.max(10.0,11.0)); //Should be 11.0
    System.out.println(Stats.geoMean(4,9)); //Should be 6
    System.out.println(Stats.geoMean(4.0,9.0)); //Should be 6.0
  }

}//end class
