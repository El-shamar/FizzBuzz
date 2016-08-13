package com.tecgle.noble.fizzbuzz;

public class fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "";
		for (int i = 1; i <= 100; i++){
			word = FizzBuzz._of(i);
			System.out.println(word);
		}
	}
}
