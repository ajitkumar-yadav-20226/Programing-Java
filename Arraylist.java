//Arraylist and its operation
import java.util.ArrayList;
public class Arraylist{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println(list);

        //remove
        list.remove(2);
        System.out.println(list);

        //get
        int element = list.get(2);
        System.out.println(element);

        //set
        list.set(2,12);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(10));

        //size of Arraylist
        
        System.out.println(list.size());

        //To print increase order
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //To print the decerasing order
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}