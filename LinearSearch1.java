package Array;
import java.util.*;

public class LinearSearch1 {
    

        public static int LinearSearch(int numbers[], int key){
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] == key){
                    return i;
                }
            }
            return -1;
        }
    
        public static void main(String[] args) {
            int numbers[]={12,32,432,2,3,2342,34324,423};
            int key =3;
            int index = LinearSearch(numbers, key);
            System.out.println(index);
        }
    }

