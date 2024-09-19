import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class CList{
    public static void main(String[] args) {
        String[] originalArray={"First","Second","Third"};
        
        var originalList=Arrays.asList(originalArray);
        originalList.set(0, "one");
        originalList.sort(Comparator.naturalOrder());
        System.out.println("List : "+originalList);
        System.out.println("Array : "+Arrays.toString(originalArray));

        // originalList.remove(0);
        //originalList.add("hi");
        ArrayList<String> stringLists =new ArrayList<>(List.of("One","Two","Three"));
        System.out.println("List1 : "+stringLists);
        String[] stringArray = stringLists.toArray(new String[4]);
        System.out.println("Array1 : "+Arrays.toString(stringArray));


        ArrayList<Integer> s =new ArrayList<>(List.of(1,2,3));
        System.out.println("List2 : "+s);
        Integer[] t = s.toArray(new Integer[5]);
        System.out.println("Array2 : "+Arrays.toString(t));
    }
}