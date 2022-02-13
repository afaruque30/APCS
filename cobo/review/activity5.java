public class activity5{

    public  String joemama(String joe){
        String[] mama = joe.split(" ");
        String withVowel = "";
        String withoutVowel = "";
        for (int i = 0; i < mama.length; i ++){
            if (hasVowel(mama[i])){
                withVowel +=" " + mama[i];
            } else {
                withoutVowel += " " + mama[i];
            }
        }
        return (withVowel+withoutVowel);
    }

    public boolean hasVowel(String doomah){
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < vowels.length(); i++){
            if(vowels.charAt(i)==doomah.charAt(0)){
                return true;
            }
        }
        return false;
    }
    public void main(String[] args) {
        System.out.println(joemama("The quick brown fox jumps over the lazy dog."));
    }

    
}