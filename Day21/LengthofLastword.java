package Day21;

public class LengthofLastword {
    
    static int  lengthOfLastWord(String s){
        String trimString=s.trim();
        String [] words=trimString.split(" ");

       return  words[words.length - 1].length();


    }
    public static void main(String[] args) {
        String s = "Hello World";
        int ans=lengthOfLastWord(s);
        System.out.println(ans);
    }
}
