import java.util.*;
public class LinkedListClass {
    public static void main(String[] args){
       LinkedList<Integer> list = new LinkedList<>();
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter total number of list: ");
       int number = scanner.nextInt();
       for (int i=0; i<number; i++){
           System.out.print("Element "+i+": ");
           int element = scanner.nextInt();
           list.add(element);
       }
       System.out.println("Elements in List: "+list);
    }
}
