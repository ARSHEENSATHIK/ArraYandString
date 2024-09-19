import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag=true;
        do{
            System.out.println("************************Available Actions*****************************");
            
            System.out.println(" 0 - to shut down \n 1 -To add items in the List \n 2 - To remove any items");
            System.out.print("Select any option : ");
            // int option=sc.nextInt();
            switch(sc.nextInt()){
                case 1:{
                    addItems(groceries);
                    break;
                }
                case 2:{
                    removeItems(groceries);
                    break;
                }
                case 0:{
                    flag=false;

                }


            }
        }while(flag);

    }
    public static void addItems( ArrayList<String> groceries){
        System.out.println("Remove items whichever u want : ");
        String[] items=sc.next().split(",");
       
        //groceries.addAll(List.of(items));
        //addAll allows duplicates
        
        for(String i:items){
            String trimmed=i.trim().toLowerCase();
            if(groceries.indexOf(trimmed)<0){
                groceries.add(trimmed);
            }
        }
        System.out.println(groceries);
       


    }
    public static void removeItems( ArrayList<String> groceries){
        System.out.println("Add items whichever u want : ");
        String[] items=sc.next().split(",");
       
        
        
        for(String i:items){
            String trimmed=i.trim().toLowerCase();
            groceries.remove(trimmed);
        }
        System.out.println(groceries);
       


    }
    

}
