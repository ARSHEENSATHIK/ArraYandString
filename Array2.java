import java.util.Arrays;
import java.util.Random;

public class Array2 {
    public static void main(String[]args){
        int[] firstArray=getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray =new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,12);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray =getRandomArray(8);
        System.out.println(Arrays.toString(thirdArray));

        int[]fourthArray=Arrays.copyOf(thirdArray, 8);
        System.out.println(Arrays.toString(fourthArray));

        int[]fifthArray=Arrays.copyOf(fourthArray, 12);
        System.out.println(Arrays.toString(fifthArray));


    }    
    public static int[] getRandomArray(int len){
        Random random=new Random();
        int[] newArray = new int[len];
        for(int i=0;i<len;i++){
            newArray[i]=random.nextInt(20);
        }
        return newArray;
    }
}
