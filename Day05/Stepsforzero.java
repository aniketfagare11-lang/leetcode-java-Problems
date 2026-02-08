package Day05;

public class Stepsforzero {
    static int zero(int num)
    {
        int count=0;        
            while(num!=0)
            {
                if(num%2==0){
                num=num/2;
                }
                else
                {
                    num=num-1;
                }
                count++;
            }
        return count;
          
    }
    public static void main(String[] args) {
        int num=14;
        int ans=zero(num);
        System.out.println(ans);
    }
}
