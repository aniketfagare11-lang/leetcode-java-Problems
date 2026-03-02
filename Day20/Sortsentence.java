package Day20;

public class Sortsentence {
    
    static String sortSentence(String s){
    
    String [] words=s.split(" ");
    String[] result = new String[words.length];

     for (int i=0;i<words.length;i++)
     {
        char lastChar = words[i].charAt(words[i].length() - 1);
         int position = lastChar - '0';
        String cleanWord = words[i].substring(0, words[i].length() - 1);
          result[position - 1] = cleanWord;
     }
      StringBuilder finalSentence = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            finalSentence.append(result[i]);

            if (i != result.length - 1) {
                finalSentence.append(" ");
            }
        }

        return finalSentence.toString();
    }
    
    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        String ans=sortSentence(s);
        System.out.println(ans);
    }
}
