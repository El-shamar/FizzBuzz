package com.tecgle.noble.fizzbuzz;
import java.util.ArrayList;

public class HelloWorld {
	
	public static void main(String[] args){
		ArrayList<Integer> myList =  new ArrayList<Integer>();
		
		ArrayList listTwo = new ArrayList();
		
		listTwo.add(4);
		listTwo.add("hello");
		
		for (Object object : listTwo) {
			System.out.println(object);
		}
		
		System.out.println("List size = " + listTwo.size());
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);

		
		for (Integer integer : myList) {
			System.out.println(integer);
		}
		
	}

}