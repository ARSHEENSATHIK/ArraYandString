import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Object[]array=new Object[3];
       // System.out.println(Arrays.toString(array));
        array[0]=new String[]{"a","b","c","d"};
       // System.out.println(Arrays.deepToString(array));
        array[1]=new String[][]{
            {"1","2"},
            {"3","4","5"},
            {"6","7","8","9"},
            {"e","f"}
        };
       // System.out.println(Arrays.deepToString(array));
        array[2]=new double[2][2][2];
        //System.out.println(Arrays.deepToString(array));

        for(Object element:array){
            System.out.println("Element Type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() =" + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }

    }
}
