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
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class IntegerListWithMethods {

	public static void main(String[] args) {
		
		//creating ArrayList of Integers and populate it
		ArrayList<Integer> list1 = new ArrayList<>();
		int[] ints = {10, 20, -12, 25, 12, 9, 5, 20};
		
		for(int i: ints) {
			list1.add(i);
//			System.out.println(list1.add(null));
			System.out.println(list1);
		}
		System.out.println(list1.contains(0)? "exists": "doesn't exist");
		System.out.println(list1.indexOf(-12)+" last occurance"+list1.lastIndexOf(20));
		 
//		3. double values in the list --if elem val > 20\
		
		for(int i =0; i<list1.size(); i++) {
			if(list1.get(i)>20) {
				
				//usage of list.set(int index, Integer element)
				System.out.println("Replaced value"+list1.set(i, list1.get(i)*2));
			}
		}
		System.out.println("after update"+list1);
		//usage of remove()
		/*
		 * for(Integer ar: list1) { if(ar.intValue()<0){
		 * 
		 * System.out.println("here, here"+ar.intValue());
		 * System.out.println("removed "+list1.remove(ar)); } else {
		 * System.out.println("we're done here"); } }
		 */
		
		System.out.println(list1.remove(3));
//		System.out.println(list1);

		System.out.println("after removal"+list1);
		
		//using sort
		Collections.sort(list1);
		System.out.println("sorted list"+list1);
		
		//convert collection to Array
		
		Integer[] intArray = new Integer[list1.size()];
		System.out.println("original array"+Arrays.toString(intArray));
		intArray = list1.toArray(intArray);
		System.out.println("after copy:"+Arrays.toString(intArray));
	}	

}
