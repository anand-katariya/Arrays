package Array;

public class Pairs {
    public static void main(String[] args) {
        int number[]={10,20,30,40,50,60,70,80,90};
        pairs(number);
    }
    public static void pairs(int number[]){
        for(int i =0; i < number.length; i++){
            for(int j =i+1;j<number.length;j++){
                System.out.print("("+number[i]+","+number[j]+")   ");
            }
            System.out.println();
        }
    }
}
