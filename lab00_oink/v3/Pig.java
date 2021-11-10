/*
* Team Frog Hats -- Ziying Jian, Abdullah Faruque, Kevin Cheng
* APCS
* L00 -- Etterbay Odincay Oughthray Ollaborationcay
* 2021-11-09
* time spent: 1 hr
* 
* DISCO:
* 0. Character.isUpperCase() is great for finding whether or not a character is upper case or not. Was important for dealing with words that begin with capital
* letters in this version. 
* 
* QCC:
* 1. After your first input, you get your output on the next line. However, when putting in your next input, its on the same line as your previous output.
* Why, and how can we change that?
* 
* WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO:
* After it gets to the last word, the second next() call tells Java to move the cursor to the next
* line, but there isn't a next line.
* when the scanner gets to the last word, the NEXT next() call wants java to move the cursor to the next line, but the problem
* is that there is no next line. 
* 
* NEW IN v3:
* fixed puncuations for last word, and made words with capital letters work. 
*/


import java.util.Scanner;

public class Pig
{
private static final String VOWELS = "aeiouAEIOU";
	private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String PUNCS = ".,:;!?";

	public static boolean isAVowel(String letter) {
		return VOWELS.indexOf(letter) != -1;
	}

	public static String allVowels(String w) {
                String vowelList = "";
                final String y = "yY";

                if (w.length() != 0) {
                        String letter = w.substring(0, 1);
                        //In order for y to be a vowel, the next letter must be a consonant
                        boolean yCheck = (y.indexOf(letter) != -1 && (w.length() == 1 || VOWELS.indexOf(w.substring(1, 2)) == -1));
                        if (yCheck || isAVowel(letter)) vowelList += letter;

                        vowelList += allVowels(w.substring(1));
                }
                return vowelList;
        }

	public static int countVowels(String w) {
		return (allVowels(w)).length();
	}

	public static boolean hasAVowel(String w) {
		return countVowels(w) > 0;
	}

	public static String firstVowel(String w) {
		if (hasAVowel(w)) return allVowels(w).substring(0, 1);
		return "";
	}

	public static boolean beginsWithVowel(String w) {
		return isAVowel(w.substring(0, 1));
	}

	public static boolean isPunc(String symbol) {
		return PUNCS.indexOf(symbol) != -1;
	}

	public static boolean isUpperCase(String letter) {
        	return CAPS.indexOf(letter) != -1;
	}

	public static boolean hasPunc( String w ) {
        	for (int i = 0; i<w.length();i++) {
			boolean test = isPunc(w.substring(i, i+1));
			if (test) return test;
		}
		return false;
        }
	

       public static boolean beginsWithUpper( String w ) {
        return Character.isUpperCase(w.charAt(0) );
    }
	
	
	
       public static String engToPig(String w) {

    String ans = "";
    String ansC = "";

    if (beginsWithVowel(w) || ((w.substring(0, 1).equals("y") || w.substring(0, 1).equals("Y")) && w.substring(1, 2).indexOf(VOWELS) != -1))
        ans = w + "way";
    /* fly returns flyway, but its supposed to return 
               yflay, style returns styleway instead of ylestay*/

    else {
        int vPos = w.indexOf(firstVowel(w));
        ans = w.substring(vPos) + w.substring(0, vPos) + "ay";
    }
    if (beginsWithUpper(w)) {
        ansC = (ans.substring(0, 1).toUpperCase() + (ans.substring(1)).toLowerCase());
        return ansC + " ";
    }
    return ans + " ";
}

    public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    while (in.hasNext()) {
		    System.out.print(engToPig(in.next()));
	    }
   
//        System.out.println(isPunc(".")); /* TRUE */
//        System.out.println(isPunc("b")); /* FALSE */
//
//        System.out.println(isUpperCase("a"));/* FALSE */
//        System.out.println(isUpperCase("A")); /* TRUE */
//
//        System.out.println(hasPunc("cat.")); /* TRUE */
//        System.out.println(hasPunc("cat"));/* FALSE */
//
//        System.out.println(beginsWithUpper("Apple")); /* TRUE */
//        System.out.println(beginsWithUpper("apple"));/* FALSE */
//
//        System.out.println(hasA("cat", "p") + "...should be false");
//        System.out.println(hasA("applesauce scruffy krrish", "p") + "...should be true");
//
//        System.out.println(isAVowel("a") + "...should be true");
//        System.out.println(isAVowel("p") + "...should be false");
//
//        System.out.println(countVowels("meatball") + "...should be 3");
//        System.out.println(countVowels("many vowels here") + "...should be 5");
//
//        System.out.println(hasAVowel("meatball") + "...should be true");
//        System.out.println(hasAVowel("bcd") + "...should be false");
//
//        System.out.println(allVowels("meatball") + "...should be eaa");
//        System.out.println(allVowels("PIG LATIN") + "...should be IAI");

        System.out.println(engToPig("cat") + "...should be atcay");
        System.out.println(engToPig("apple") + "...should be appleway");
    }//end main()

}//end class Pig
