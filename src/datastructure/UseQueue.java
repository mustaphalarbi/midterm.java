package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> groceryList = new LinkedList<String>();
		// add elements
		groceryList.add("bread");
		groceryList.add("chicken");
		groceryList.add("potato");
		groceryList.add("hot sauce");
		groceryList.add("cheese");
		System.out.println(groceryList);

		//Peek first element

		System.out.println(groceryList.peek());

		// remove first element

		System.out.println(groceryList.remove());

		//poll first element
	   groceryList.poll();
	   System.out.println(groceryList);



		System.out.println(" print elements after second poll using for each loop ");
		// Poll again and print all element with for each
		groceryList.poll();
		for (String grocery : groceryList) {
			System.out.println(grocery);
		}
		System.out.println(" print elements after second poll using iterator ");
		Iterator<String> it = groceryList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
