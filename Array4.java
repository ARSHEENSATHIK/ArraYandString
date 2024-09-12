import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        int len=10;
        Random r=new Random();
        int[]a=new int[len];
        for(int i=0;i<len;i++){
            a[i]=r.nextInt(50);
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
