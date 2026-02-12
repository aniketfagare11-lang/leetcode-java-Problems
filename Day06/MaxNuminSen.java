package Day06;

public class MaxNuminSen {

static int mostwordsfound(String [] sentences)
{
    
    int max=0;
    int word=0;
    for(int i=0;i<sentences.length;i++){
        int count =0;
        for (int j=0;j<sentences[i].length();j++)
    {
        if(sentences[i].charAt(j) == ' ')
        {
            count++;
        }
        else{
            word=count+1;
        }
    }
    if (max<word)
    {
        max=word;
    }
}
    return max;
}
public static void main(String[] args) {
     String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
     int ans=mostwordsfound(sentences);
     System.out.println(ans);


}
    
}
