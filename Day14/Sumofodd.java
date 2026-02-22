package Day14;

public class Sumofodd {
    static int sumOddLengthSubarrays(int[] arr){

        int sum = 0;

        for(int i = 0; i < arr.length; i++){

            int tempSum = 0;

            for(int j = i; j < arr.length; j++){

                tempSum += arr[j];

                int length = j - i + 1;

                if(length % 2 != 0){
                    sum += tempSum;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {1,4,2,5,3};
        int ans = sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }
}