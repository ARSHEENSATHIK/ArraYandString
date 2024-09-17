import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
record GroceryItem(String title,String type,int count){
    public GroceryItem(String title){
        this(title, "Diary", 1);
    }
    @Override
    public String toString(){
        return title.toUpperCase() + " ( " + type.toUpperCase()+" ) "+" : "+count;
    }

}
public class AList{
   
    public static void main(String[] args) {
        GroceryItem[] groceryArray =new GroceryItem[3];
        groceryArray[0]=new GroceryItem("Milk");
        groceryArray[1]=new GroceryItem("apples", "Fruits", 6);
        System.out.println(Arrays.toString(groceryArray));

     
        ArrayList objectList =new ArrayList();  //raw version of ArrayList
        //Which means there is no declaration about the argument type 
        objectList.add(new GroceryItem("Butter"));
        objectList.add("yogurt");
        System.out.println(objectList);
 

        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        groceryList.add(new GroceryItem("Banana", "Fruit", 6));
        groceryList.add(new GroceryItem("milk"));
        groceryList.set(0,new GroceryItem("Oranges", "Fruit", 6));
        groceryList.add(0,new GroceryItem("mango", "Fruit", 6));

        System.out.println(groceryList);

    }
}