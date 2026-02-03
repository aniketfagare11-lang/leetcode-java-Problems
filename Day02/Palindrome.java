package Day02;

public class Palindrome {
    
    static boolean  ispalindrome(int x)
    {
        int n=x;
        int reminder, reversed = 0;
        if(x<0)
        {
            return false;
        }
        
        while (x!=0)
        {
            reminder=x%10;
            reversed=reversed*10+reminder;
            x /=10;
        }
        
        if (reversed ==n)
        {
            return true;
        }
            
       return false;     
        
        
    }

    public static void main(String[] args) {
        int x=121;
        boolean ans=ispalindrome(x);
        System.out.println(ans);
    }
    
}

    

