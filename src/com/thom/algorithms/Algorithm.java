package com.thom.algorithms;

import java.util.List;

public abstract class Algorithm 
{
	public String name;
	
	public long start;
	public long end;
	public double duration;
	
	public Algorithm(String name) 
	{
		this.name = name;
	}
	
	public abstract List<Integer> sort(List<Integer> list);
	
	public double getRuntime() 
	{
		return duration / 1000000 / 1000;
	}
}