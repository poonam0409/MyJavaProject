package com.poonam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class StringManipulation {

	public static void printDuplicateCharacter(String s)

	{
		char charArray[] = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (Character ch : charArray) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}
		Set<Entry<Character, Integer>> duplicateSet = map.entrySet();

		for (Entry<Character, Integer> entry : duplicateSet) {
			if (entry.getValue() > 1)
				System.out.println(entry);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		printDuplicateCharacter("Poonam Kumaaaaarrrrii");
		ArrayList< ? > ar = new ArrayList<>();
		ArrayList al = new ArrayList();
		
		
	}

}
