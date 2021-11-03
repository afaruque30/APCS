//Julia Kozak, Joshua Yagupsky, Abdullah Faruque
//APCS
//HW31: Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
//2021-11-03
//Time spent: 0.8hrs

/*
DISCO: you can use helper functions to shorten your code, was very useful for this homework!
QCC: 
*/

public class Pig
{
  //Q: How does this initialization make your life easier?  
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) {
	  boolean output=false;
	  for(int i=0;i<w.length();i++){
		  if (String.valueOf((w.charAt(i))).equals(letter)){output=true;}
	  }
	  return output;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ){
	  boolean output=false;
	  for(int i=0;i<5;i++){
		  if((String.valueOf(VOWELS.charAt(i))).equals(letter)){
			  output=true;
		  }
	  }
	  return output;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ){
	  int output=0;
	  for(int i=0;i<w.length();i++){
		  if (isAVowel((String.valueOf((w.charAt(i)))))){
			  output++;
	  }
  }
  return output;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) {
	  boolean output=false;
	  for(int i=0;i<w.length();i++){
		  if (isAVowel(String.valueOf((w.charAt(i))))){output=true;}
	  }
	  return output;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) {
	  String output="";
	  if (hasAVowel(w)){
	  for(int i=0;i<w.length();i++){
		  if (isAVowel(String.valueOf((w.charAt(i))))){
			  output+=(String.valueOf((w.charAt(i))));
		  }
	  }
	  }
	  else{};
	  return output;
  }


  public static void main( String[] args ) 
  {
    System.out.println(hasA("cat", "a"));//true
	System.out.println(isAVowel("a"));//true
	System.out.println(isAVowel("b"));//false 
	System.out.println(isAVowel("e"));//true 
	System.out.println(countVowels("meatball"));//3
	System.out.println(hasAVowel("cat"));//true
	System.out.println(hasAVowel("zzz"));//false 
	System.out.println(allVowels("meatball")); //"eea"
	System.out.println(allVowels("joemama"));//"oeaa"
	
  }//end main()

}//end class Pig