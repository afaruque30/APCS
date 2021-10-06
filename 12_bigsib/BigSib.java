/*
ABdullah Faruque + Green Lantern
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-05
*/
public class BigSib {
	public String helloMsg;
	public String greet(String input){
		return helloMsg  + " " + input ;
	}
	public void setHelloMsg(String input){
		helloMsg=input;
	}
}
/*
Disco
using public void rather than static allows you to make multiple bigsibs in the greet function
*/