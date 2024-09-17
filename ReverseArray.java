import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        int len=sc.nextInt();
        int[]Arr=new int[len];
        for(int i=0;i<len;i++){
            // int num=sc.nextInt();
            Arr[i]=sc.nextInt();
        }
        System.out.println("Before Reversing : "+Arrays.toString(Arr));
        int[] reversedArray =reverseArray(Arr);
        System.out.println("After Reversing : "+Arrays.toString(reversedArray));
        reversing(reversedArray);

    }
    private static int[] reverseArray(int[]Arr){
        //by using another array 
        int[]b=new int[Arr.length];
            for(int i=Arr.length-1,j=0;i>=0;i--){
                b[j++]+=Arr[i];
            }
            return b;
    } 

    private static void reversing(int[]Arr){
        int maxIndex=Arr.length-1;
        
        for(int i=0;i<Arr.length;i++){
            int temp=Arr[i];
            Arr[i]=Arr[maxIndex-i];
            Arr[maxIndex-i]=temp;


        }
        System.out.println("Reversing the array without using another Array : "+Arrays.toString(Arr));

    }
        
}
