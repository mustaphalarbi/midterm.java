package datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> veggieList = new ArrayList<String>();

		//add elements
		veggieList.add("carrots");
		veggieList.add("tomato");
		veggieList.add("onions");
		veggieList.add("garlic");
		veggieList.add("salad");
		veggieList.add("broccoli");

		//print the whole list
		 System.out.println(veggieList);

		 //peek element
		System.out.println(veggieList.get(0));

		//remove element
		//veggieList.remove("carrots");
		//System.out.println(veggieList);

		// Print all elements using iterator
		Iterator<String> it = veggieList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// Sort elements using Collections

		Collections.sort(veggieList);
		Iterator<String> it2 = veggieList.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}



	}

}
