import java.util.LinkedList;
import java.util.Collection;


class CollectionPractical1{
	public CollectionPractical1(){
		Collection <Integer> c = new LinkedList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		
		if (c.isEmpty()){
			System.out.println("the collection is empty");
		}else{
			System.out.println("the collection is not empty");
		}

		int size = c.size();
		System.out.println("the Size of the c: " +size);

		int elementToCheck = 4;

		if (c.contains(elementToCheck)){
			System.out.println("The collection contains:" + elementToCheck);
		}else{
			System.out.println("the collection does not contain:" + elementToCheck);
		}

		c.remove(1);

		System.out.println(c);
	}
public static void main(String[]args){
	new CollectionPractical1();

}
}


