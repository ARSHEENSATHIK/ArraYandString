
import java.util.*;

public class MinimumElement {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        readIntegers();
    }
    private static void readIntegers(){
        int []a=new int[5];
       
        for(int i=0;i<5;i++){
            int num=sc.nextInt();
            a[i]=num;
        }
        System.out.println(Arrays.toString(a));
        findMin(a);
    }
    private static void findMin(int[]a){
        int smallest=a[0];
        for(int i=0;i<a.length-1;i++){
            if(smallest>a[i+1]){
                smallest=a[i+1];
            }
        }
        System.out.println(smallest);
    }
}
