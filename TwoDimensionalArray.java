import java.util.Arrays;
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][]array=new int[4][4];
        // System.out.println(Arrays.toString(array));
        System.out.println(("Array Length : " + array.length));

        for(int i=0;i<array.length;i++){
            var innerArray =array[i];
            for(int j=0;j<innerArray.length;j++){
                // System.out.print(array[i][j] + " ");
                array[i][j]=(i*10)+(j+1);
            }
           
            // System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
        // for(int[] outer : array){
        //     System.out.println(Arrays.toString(outer));
        // }

        // for(var outer :array){
        //     for(var element :outer){
        //         System.out.print(element + " ");
        //     }
        //     System.out.println();
        // }

       // System.out.println(Arrays.deepToString(array));
    }
}
