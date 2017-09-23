package com.thom.algorithms;

import java.util.List;

public class InsertionSort extends Algorithm
{
	public InsertionSort() 
	{
		super("Insertion Sort");
	}

	@Override
	public List<Integer> sort(List<Integer> list)
	{	
		start = System.nanoTime();
		
		int temp;
		
		for (int i = 0; i < list.size(); i++)
		{
			for (int j = i; j > 0; j--)
			{
				if (list.get(j) < list.get(j - 1))
				{
					temp = list.get(j);
					list.set(j, list.get(j - 1));
					list.set(j - 1, temp);
				}
			}
		}
		
		end = System.nanoTime();
		duration = (end - start);
		return list;
	}
}