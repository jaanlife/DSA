/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Desktop.Collection;

import java.util.LinkedList;
import java.util.Collection;

public class CollectionPractical1 {
    
    public CollectionPractical1 () {
		 Collection <Integer> c = new LinkedList();
		 c.add(5);
		 c.add(4);
		 c.add(3);
		 c.add(2);
                 
                 boolean isEmpty = c.isEmpty();
                 System.out.println(isEmpty);
                 
		 System.out.println(c);
                 
                 int size = c.size();
                 System.out.println(size);
            
            boolean contains = c.contains(4);
            System.out.println(c);
    }
    
    public static void main(String args[]) {
        new CollectionPractical1();
    }
}
