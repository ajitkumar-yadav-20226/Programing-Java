//Access Modifier
import java.util.*;
public class AccessModifier{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
    }
}
class Pen{
    private String color;
    private int tip;
    String getcolor(){
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void setcolor(String newcolor){
        this.color = newcolor;
    }
    void settip(int newtip){
        this.tip = tip;
    }
}