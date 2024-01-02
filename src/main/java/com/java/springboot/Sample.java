package com.java.springboot;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sample {
	
	public static void main(String[] args) {
		
		List<String> list=new CopyOnWriteArrayList<String>();
		list.add("Narender");
		list.add("Neeraja");
		list.add("Aswitha");
		list.add("Anny");
		list.add("Mittu");
		
		for(String s:list) {
			System.out.println(s);
			list.add("Funny");
		}
		
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(37, "Narender");
		map.put(36, "Neeraja");
		map.put(11,"Aswitha");
		map.put(12,"Shreyanvi");
		
		for(Map.Entry<Integer, String> entries:map.entrySet()) {
			System.out.println(entries.getKey()+" "+entries.getValue());
			
		}
		
		map.entrySet().stream().forEach(Key->System.out.println(Key));
	
	}
}
