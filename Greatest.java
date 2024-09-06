package Array;
import java.util.*;

public class Greatest {
    public static int LargestNo(int numbers[]){
            int largest = Integer.MIN_VALUE;
            for (int i = 0; i< numbers.length; i++){
                if(numbers[i] > largest){
                    largest = numbers[i];
                }
            }
            return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,1,2,32,342,43,3,43,432,23,1,12232};
        int big = LargestNo(numbers);
        System.out.println(big);
    }
    
    
}
