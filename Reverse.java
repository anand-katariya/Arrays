package Array;

public class Reverse {
    public static void reverse(int number[]){
        int n = (0+number.length)/2;
        int st = 0;
        int ed = number.length -1;
        for(int i = 1; i<=n;i++){
             int ab = number[st];
             number[st] = number[ed];
             number[ed]=ab;
             st++;
             ed--;
        }
        for(int i =0; i<=number.length;i++){
            System.out.println(number[i]);
        }
        
    }
    public static void main(String[] args) {
        int number[] = {10,20,30,40,50,60,70,80,90,100};
        reverse(number);
    }
}
