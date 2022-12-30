package ExtraCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCount {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");
		System.out.println("Count all with frequency");
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet) { System.out.println(temp + ": " + Collections.frequency(list, temp));
		}
		 
		}
		

	}


