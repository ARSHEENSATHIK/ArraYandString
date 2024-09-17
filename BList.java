import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Comparator;
public class BList {
    public static void main(String[] args) {
        // String[] items={"apples","bananas","milk","eggs"};
        // Integer[] contents={4,5,2,48};
        // List<String> l=List.of(items);
        // List<Integer> co=List.of(contents);
        // ArrayList<Integer> c=new ArrayList<>();
        // c.add(1);
        // c.add(2);
        // c.add(3);
        // c.add(4);
        // System.out.println(l);
        // System.out.println(co);
        // System.out.println(c);
        // System.out.println(l.getClass().getName());
        // // l.add("yolk");
        // List<String> groceries =new ArrayList<>(l);
        // groceries.add("yolk");
        // System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
            List.of("chicken","Mutton","Prawn")
        );
        // System.out.println(nextList);
     
        // nextList.addAll(groceries);
        // System.out.println(nextList);

        // System.out.println("Third Item = " + nextList.get(2));

        // if(nextList.contains("eggs")){
        //     System.out.println("List contains eggs");
        // }

        // nextList.add("Prawn");
        // System.out.println("first = " + nextList.indexOf("Prawn"));
        // System.out.println("Last = "+nextList.lastIndexOf("Prawn"));
        // Integer[] count ={1,2,3,4,5,6,7,8,9};
        // List<Integer> lm=List.of(count);
        // System.out.println(lm);

        // System.out.println("***********************************************");
        // System.out.println(groceries);
        // groceries.remove(1);
        // System.out.println(groceries);
        // groceries.remove("eggs");
        // System.out.println(groceries);
        // groceries.removeAll(List.of("apples","milk"));
        // System.out.println(groceries);

        // System.out.println("****************************************************");
        // System.out.println(nextList);
        // nextList.retainAll(List.of("Prawn","apples","eggs"));
        // System.out.println(nextList);

        nextList.clear();
        System.out.println(nextList);
        System.out.println("isEmpty : "+ nextList.isEmpty());


        nextList.addAll(List.of("apples","milk","mustard"));
        nextList.addAll(Arrays.asList("eggs","pickles","bread","juice"));
        System.out.println(nextList);
        nextList.sort(Comparator.naturalOrder());
        System.out.println(nextList);
        nextList.sort(Comparator.reverseOrder());
        System.out.println(nextList);

        // var groceryArray =nextList.toArray(new String[nextList.size()]);
        // System.out.println(Arrays.toString(groceryArray));


    }
}
