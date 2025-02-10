
import java.util.Collection;
import java.util.LinkedList;

class CollectionPractical1
{
	public CollectionPractical1(){
	    Collection<Integer> c = new LinkedList();
		c.add(5);
		c.add(4);
		c.add(3);
		c.add(2);
		c.add(1);
		c.remove(2);
		System.out.println("collection empty ?"+c.isEmpty());
		
		System.out.println("Size of Collection"+c.size());
		
		int elementToCheck=5;
		System.out.println("Does the collection contain"+elementToCheck+"?"+c.contains(elementToCheck));
		
		System.out.println("Eleement in the collection after removeble :"+c);
		
		
	}
	 public static void main(String[] args){
         new CollectionPractical1();
      }
	
	
}
