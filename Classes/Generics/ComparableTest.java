package Generics;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(140);
		nums.add(87);
		nums.add(42);
		nums.add(-12);
		
		for(Integer n : nums) {
			System.out.println(n);
		}
	}

}
