// code to be added to your growing Pig Latin translator

public class Pig {

    private static final String VOWELS = "aeiouy";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";


    /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
    public static boolean isPunc( String symbol ) {
	return PUNCS.indexOf( symbol ) != -1;
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
    public static boolean isUpperCase( String letter ) {
		return CAPS.indexOf(letter)!=-1;
    }

  /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc("cat.") -> true
            hasPunc("cat") -> false
      =====================================*/
 
    public static boolean hasPunc( String w ) {
		for(int i = 0; i<w.length();i++){
			if (isPunc(w.substring(i,i+1))){
				return true;
			}
		}
		return false;
    }


    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {

	return isUpperCase(w.substring(0,1) );
    }

	public static void main(String[] args){
		System.out.println(isPunc(".")); /* TRUE */
		System.out.println(isPunc("b")); /* FALSE */
		System.out.println(isUpperCase("a"));/* FALSE */
		System.out.println(isUpperCase("A")); /* TRUE */
		System.out.println(hasPunc("cat.")); /* TRUE */
		System.out.println(hasPunc("cat"));/* FALSE */
		System.out.println(beginsWithUpper("Apple")); /* TRUE */
		System.out.println(beginsWithUpper("apple"));/* FALSE */
	}

}//end class Pig