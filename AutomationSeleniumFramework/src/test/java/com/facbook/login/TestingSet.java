package com.facbook.login;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestingSet {

	public static void main(String[] args) {
		// types ==> HashSet, LinkedHashSet, Tree set
		//Set is a part of the Java Collections Framework, or Java Data Structure
		//Set is an interface
		//Why we need set in Java: to handle unique value (no duplicate) 
		
		Set<Integer> myset = new HashSet<>();
		Set<Integer> myset2 = new LinkedHashSet<>();
		Set<Integer> myset3 = new TreeSet<>();
		
		//create an array with 10,9,2,3,4,5,5,4,6 & remove the duplicate
		
		int [] a = {10,9,2,3,4,5,5,4,6};
		System.out.println("Array a " +Arrays.toString(a));
		
		//New way in JAVA
		Set<Integer> mySet= new HashSet<>(Arrays.asList(10,9,2,3,4,5,6,4,5));
		System.out.println("Easy Way for Set "+mySet);
		
		Set <Integer> newset = new HashSet<>();
		newset.add(10);
		newset.add(9);
		newset.add(2);
		newset.add(3);
		newset.add(4);
		newset.add(5);
		newset.add(5);
		newset.add(4);
		newset.add(6);
		
		System.out.println("Without Duplicate Values "+newset);
		
		//to remove duplicate value with Loop, we use 2 Loops; 1 loop inside another loop
		
		List <Integer> mylist = new ArrayList<>(Arrays.asList(10,9,2,3,4,5,6,4,5));
		System.out.println("This is my list " +mylist);
	}

}
