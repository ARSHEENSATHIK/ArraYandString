import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        String[] s= {"Arshu","Tamil","Batcha","Kumar","Nasreen","Shameem"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        if(Arrays.binarySearch(s, "Batcha")>0){
            System.err.println("Found  in the List");
        }
        else{
            System.out.println("Not Found");
        }

        int[]a={9,8,7,5,4};
        int[]b=a;
        if(Arrays.equals(a, b)){
            System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are not Equal");
        }
    }
}
