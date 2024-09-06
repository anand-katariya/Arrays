package Array;

public class BinarySearch {
    
    public static int BinarySearch(int number[],int item){
        int start = 0;
        int end = number.length -1 ;
        while (start<=end) {
            int mid = (start+end)/2;
            if(number[mid] == item){
                return mid;
            }
            if(number[mid] < item){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60,70,80,90,199};
        int key = 30 ;
        System.out.println(BinarySearch(number, key));
    }
}
