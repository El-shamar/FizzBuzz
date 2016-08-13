package com.tecgle.noble.fizzbuzz;

public class FizzBuzz {

	public static String of(int i) {
		if (i == 0)
			return Integer.toString(i);
		
		return _of(i);
	}	

	public static String _of(int i) {
		if(i % (3 * 5) == 0 )
			return "fizzbuzz";
		
		if(i % 3 == 0)
			return "fizz";
		
		if(i % 5 == 0)
			return "buzz";
		
		return Integer.toString(i);
	}
}
