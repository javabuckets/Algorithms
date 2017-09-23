package com.thom.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.thom.algorithms.Algorithm;

public class ListUtil 
{
	/**
	 * Initializes a List<Integer> of n size, wherein the maximum integer value is maxVal
	 * @param n List size
	 * @param maxVal Maximum integer value
	 * @return The random List<Integer> generated
	 */
	public static List<Integer> initializeRandomList(int n, int maxVal)
	{
		List<Integer> list;
		System.out.println("List of random numbers:");
		list = generateRandomList(n, maxVal);
		System.out.println(list);
		return list;
	}
	
	public static List<Integer> generateRandomList(int n, int maxVal)
	{
		List<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		
		for (int i = 0; i < n; i++)
		{
			list.add(r.nextInt(maxVal + 1));
		}
		
		return list;
	}
	
	/**
	 * Sorts a given List<Integer> with the specified Algorithm
	 * @param algorithm Algorithm object
	 * @param list List<Integer> to sort
	 */
	public static void sortList(Algorithm algorithm, List<Integer> list)
	{
		System.out.println("Sorting list using " + algorithm.name + "...");
		
		algorithm.sort(list);
		
		printFeedback(algorithm, list);
	}
	
	public static void printFeedback(Algorithm algorithm, List<Integer> list) 
	{
		System.out.println(list);
		System.out.println(algorithm.getRuntime() + " seconds");
	}
}