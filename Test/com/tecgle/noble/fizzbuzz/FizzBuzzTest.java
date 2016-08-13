package com.tecgle.noble.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void fizzbuzzOf_0is_0(){
		assertEquals("0", FizzBuzz.of(0));
	}
	
	@Test
	public void fizzbuzzOf_1is_1() {
		assertEquals("1", FizzBuzz.of(1));
	}
	
	@Test
	public void fizzbuzzOf_3is_fizz(){
		assertEquals("fizz", FizzBuzz.of(3));
	}
	
	@Test
	public void fizzbuzzOf_6is_fizz(){
		assertEquals("fizz", FizzBuzz.of(6));
	}
	
	@Test
	public void fizzbuzzOf_5is_buzz(){
		assertEquals("buzz", FizzBuzz.of(5));
	}
	
	@Test
	public void fizzbuzzOf_10is_buzz(){
		assertEquals("buzz", FizzBuzz.of(10));
	}
	
	@Test
	public void fizzbuzzOf_15is_fizzbuzz(){
		assertEquals("fizzbuzz", FizzBuzz.of(15));
	}
	
	
}
