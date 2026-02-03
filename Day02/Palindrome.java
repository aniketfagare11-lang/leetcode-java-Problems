package Day02;

public class Palindrome {
    
    static boolean  ispalindrome(int x)
    {
        
        if(x<0)
        {
            return false;
        }
        int n=x;
        int reversed=0;
        
        while (x!=0)
        {
            int reminder=x%10;
            reversed=reversed*10+reminder;
            x /=10;
        }
        
       return reversed == n;
    }

    public static void main(String[] args) {
        int x=121;
        boolean ans=ispalindrome(x);
        System.out.println(ans);
    }
    
}

    

