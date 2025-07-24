import java.util.*;
public class Deque{
    public static void main(String args[]){
       Deque<Integer>deque = new LinkedList<>();
       deque.addfirst(1);
       deque.addfirst(2);
       deque.addfirst(3);
       deque.addfirst(4);
       deque.addfirst(5);
       System.out.println(deque);
      // deque removeLast();
       System.out.println(deque.getfirst());
       System.out.println(deque.getLast());

    }
}