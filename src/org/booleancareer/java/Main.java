package org.booleancareer.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// Collection
		List<String> strs = new ArrayList<>();
		
		strs.add("Hello");
		strs.add("World");
		
		for (int x=0;x<strs.size();x++) {
			
			String str = strs.get(x);
			System.out.println(str);
		}
		
		System.out.println("-------------------------");
		
		for (String str : strs) {
			
			System.out.println(str);
		}
		
		System.out.println(strs.contains("Hello!"));
		
		List<Integer> values = new ArrayList<>();
		
		values.addAll(Arrays.asList(10, 33, 45, 18));
		System.out.println(values);
		
//		values.remove((int) 10);
		values.remove((Integer) 10);
		System.out.println(values);
		
		Integer[] valuesArr = values.toArray(new Integer[] {});
		
		System.out.println("-------------------------");
		
		System.out.println(Arrays.toString(valuesArr));
		
		Set<Integer> sValues = new HashSet<>();
		sValues.add(10);
		sValues.add(20);
		sValues.add(20);
		
		System.out.println(sValues);
		
		for (Integer sv : sValues) {
			System.out.println(sv);
		}
		
		Map<Integer, String> map = new HashMap<>();
		map.put(5, "Hello");
		map.put(18, "World");
		map.put(34, "Ciao mondo");
		
		System.out.println(map);
		System.out.println(map.get(34));
		
		for (Integer key : map.keySet()) {
			
			String value = map.get(key);
			
			System.out.println(key + " --> " + value);
		}
	}
}





























