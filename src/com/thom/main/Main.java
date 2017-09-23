package com.thom.main;

import java.util.List;

import com.thom.algorithms.InsertionSort;
import com.thom.list.ListUtil;

public class Main 
{
	public static List<Integer> numbers;
	
	private static final int 
		n = 10000, 
		maxVal = 1000;
	
	public static void main(String[] args) 
	{
		numbers = ListUtil.initializeRandomList(n, maxVal);
		
		ListUtil.sortList(new InsertionSort(), numbers);
	}
}