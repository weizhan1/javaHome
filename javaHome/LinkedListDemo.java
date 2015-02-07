package javaHome;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addLast("Z");
		ll.addFirst("A");
		ll.add(1, "A2");
		
		System.out.print("Original contents of ll: " + ll);
		
		// remove elements from the linked list
	      ll.remove("F");
	      ll.remove(2);
	      System.out.println("Contents of ll after deletion: "
	       + ll);
	      
	      // remove first and last elements
	      ll.removeFirst();
	      ll.removeLast();
	      System.out.println("ll after deleting first and last: "
	       + ll);

	      // get and set a value
	      Object val = ll.get(2);
	      ll.set(2, (String) val + " Changed");
	      System.out.println("ll after change: " + ll);
	}

}
