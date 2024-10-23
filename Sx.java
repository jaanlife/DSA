import java.util.LinkedList;
import java.util.SequencedCollection;

public class Sx {
    public Sx() {
        SequencedCollection<Integer> sc = new LinkedList<>();
        sc.addFirst(5);
        sc.addFirst(2);
        sc.addLast(3);
        
        System.out.println(sc.getFirst()); // Prints the first element
        System.out.println(sc.removeLast()); // Removes and prints the last element
        System.out.println(sc); // Prints the collection
        System.out.println(sc.reversed()); // Prints the collection in reverse order
    }

    public static void main(String[] args) {
        new Sx();
    }
}
