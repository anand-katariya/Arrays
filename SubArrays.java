package Array;

public class SubArrays {
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60,60,70,80};
        subArrays(number);
        maxSubarraySumBruteForce(number);
        maxSubarraySumPrefixSum(number);
        maxSubarraySumKadanesAlgorithm(number);
    }
    public static void subArrays(int number[]){
        for(int i = 0;i<number.length;i++){
            int start =i;
            for(int j =i; j<number.length;j++){
                int end =j;
                for(int k = start; k<=end;k++){
                System.out.print(number[k] +" ");
                }
            System.out.println();
            }
            System.out.println();
        }
    }


    // O(n**3)
    public static void maxSubarraySumBruteForce(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<number.length; i++){
            int start =i;
            for(int j =i;j<number.length;j++){
                int end = j;
                currSum = 0;
                for (int k = start; k<=end;k++){
                    currSum += number[k];
                }
                //System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }

                
            }
        }
        System.out.println("max sum " + maxSum);
    }


        // O(n**2)
    public static void maxSubarraySumPrefixSum(int number[]){

        int prefixArr[]=new int[number.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefixArr[0] =number[0];

        for(int i =1; i<prefixArr.length;i++){
            prefixArr[i] = prefixArr[i-1] + number[i];
        }
        for(int i = 0;i<number.length;i++){
            int start = i;
            for(int j =i; j<number.length;j++){
                int end = j;
                currSum = start== 0? prefixArr[end] : prefixArr[end]-prefixArr[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }                
            }
        }
        System.out.println("max sum "+maxSum);
        
    }

        // O(n)
    public static void maxSubarraySumKadanesAlgorithm(int number[]){
        int maxSum =Integer.MIN_VALUE;
        int currSum = 0;
        for(int i =0; i<number.length;i++){
            currSum = currSum+ number[i];
            if(currSum <0){
                currSum=0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("max sum"+maxSum);



    }




}
  