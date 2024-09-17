
import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {
    
    
    // write code here 
    static Scanner sc=new Scanner(System.in);
   
    public static void getIntegers(int len){
        
        
        int []a=new int[len];
        for(int i=0;i<len;i++){
            int num=sc.nextInt();
            a[i]=num;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("-".repeat(20));
        SortArray(a);
       
    }
    
    
    public static void SortArray(int []b){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                if(b[i]<b[j]){
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
    public static void main(String[]args){
        int len=sc.nextInt();
        getIntegers(len);
    }
}
    


 