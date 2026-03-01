package Day19;

public class Pangram {
 static boolean checkIfPangram(String sentence){
    
    for(char ch = 'a'; ch <= 'z'; ch++){
       if(sentence.indexOf(ch)==-1)
        {
            return false;
        }
    }
    return true;
    
 }   

 public static void main(String[] args) {
     String sentence = "thequickbrownfoxjumpsoverthelazydog";
     boolean ans=checkIfPangram(sentence);
     System.out.println(ans);
 }
}
