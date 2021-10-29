public class doubleChar{
	public String doubleChar(String str) {
	String output="";
  		for(int i=0;,i<str.length();i++){
  		output+=(str.substring(i,i+1)+str.substring(i,i+1));
  		}
  	return output;
}

}
