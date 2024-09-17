import java.util.Arrays;
import java.util.Scanner;

public class Day10 {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("enter");
        String input= sc.next();

        String[] splits=input.split(",");
        int[] values=new int[splits.length];
        System.out.println(splits.length);
        for(int i=0;i<splits.length;i++){
            values[i]=Integer.parseInt(splits[i].trim());
        }
        System.out.println(Arrays.toString(values));
    }
}
