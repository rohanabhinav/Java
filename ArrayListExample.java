package collections;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Coconut");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);
		Iterator itr = fruits.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		Collections.sort(fruits);
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}
