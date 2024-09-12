import java.util.Arrays;

public class Array1{
    public static void main(String[] args) {
        int[]a=new int[4];
        for(int i=0,j=1;i<4;i++){
            a[i]=j++;
        }
        System.out.println(Arrays.toString(a));

        int[] newArray;
        newArray=new int[]{5,4,3,2,1};
        for(int i=0;i<newArray.length;i++){
            System.out.println(Arrays.toString(newArray));
            break;
        }

        int[]b={3,5,7,9,11,13};
        for(int l : b){
            System.out.print(l +" ");
        }
    }
}