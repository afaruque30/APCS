public class countHi{
		public String countHi(String str) {
	int output=0;
	int i=0;
	for(int i=0;,i<str.length();i++){
  		if((str.substring(i,i+1)+(str.substring(i+1,i+2)))=="hi"){
  		output+=1;
  		}
  	return output;
	}
	}
  		

}
