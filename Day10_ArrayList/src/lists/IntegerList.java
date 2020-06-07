/*Objectives in Integer list
0. Create ArrayList of integers & populate it.
1. check if element exists in the list.
2. display index of 1st occurance of the elem
3. double values in the list --if elem val > 20
4. remove elem at the specified index
5. remove by elem. -- rets true /false.*/


package lists;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IntegerList {

	public static void main(String[] args) {
		
		//creating ArrayList of Integers and populate it
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10); //auto boxin (new Integer(10))
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
//		list1.add("abc");
		System.out.println(list1);
		System.out.println("list1 via string"+list1);
		
		//display list: Iterator
		Iterator<Integer> itr = list1.iterator();
		System.out.println("List1 via iterator");
		while(itr.hasNext())

			System.out.println(itr.next());

		
		//display list using for loop
		System.out.println("using For loop");
		for (int i = 0; i < list1.size(); i++) {
				System.out.println(list1.get(i));
		}
		
		//display using ListIterator
		ListIterator<Integer> listItr = list1.listIterator();
		
		System.out.println("using ListIterator");
		do {
			System.out.println(listItr.next());
		}
		while(listItr.hasNext());
	}	

}
