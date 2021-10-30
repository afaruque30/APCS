// Team solobozo: Abdullah Faruque
// APCS
// HW28: PPMP
// 2021-10-29
// time spent- 1 hour

/*
DISCO: you have to make each method static to test them out, even though static isn't present in the coding bat coding place thingy.
QCC: ...
*/
public class string2problems {
	
    public static void main(String[] args) {
        System.out.println("cases for countHi");
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
        System.out.println("cases for doubleChar");
        System.out.println(doubleChar("The")); // "TThhee"
        System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
        System.out.println("cases for catDog");
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
        System.out.println("cases for countCode");
        System.out.println(countCode("aaacodebbb")); // 1
        System.out.println(countCode("codexxcode")); // 2
        System.out.println(countCode("cozexxcope")); // 2
        System.out.println("cases for endOther");
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
        System.out.println("cases for xyzThere");
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true
    }

public static int countHi(String str) {
	int counter = 0;
  for(int i=0; i < str.length()-1; i++){
    if (str.substring(i, i+2).equals("hi")){
      counter +=1;
    }
  }
  return counter;
}
  		

    public static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output += (str.substring(i, i + 1) + str.substring(i, i + 1));
        }
        return output;
    }


public static boolean catDog(String str) {
    int dogcount = 0;
    int catcount = 0;
    for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 3).equals("cat")) {
            catcount += 1;
        } else if (str.substring(i, i + 3).equals("dog")) {
            dogcount += 1;
        } else {}
    }
    return dogcount == catcount;
}
public static int countCode(String str) {
    int output = 0;
    for (int i = 0; i < str.length() - 3; i++) {
        if ((str.substring(i, i + 2) + str.charAt(i + 3)).equals("coe")) {
            output += 1;
        }
    }
    return output;
}
public static boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    if (a.length() < b.length()) {
        String c = b;
        b = a;
        a = c;
    }
    int aL = a.length();
    int bL = b.length();
    if ((a.substring(aL - bL, aL)).equals(b)) {
        return true;
    } else {
        return false;
    }
}
public static boolean xyzThere(String str) {
    for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i + 3).equals("xyz")) {
            if (i == 0 || str.charAt(i - 1) != '.')
                return true;
        }
    }
    return false;
}
}
