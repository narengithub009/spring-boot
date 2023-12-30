package com.java.springboot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sample {
	
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Narender");
		list.add("Neeraja");
		list.add("Aswitha");
		list.add("Anny");
		list.add("Mittu");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
