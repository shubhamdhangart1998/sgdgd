package com.tnsif.dayfifteen.MapDemo;

import java.util.Hashtable;

public class HashMapTableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101, "Mumbai");
		ht.put(102, "New Mumbai");
		ht.put(103, "Pune");
		ht.put(101, "Aurangbad");
		
		
		ht.putIfAbsent(104, "PCMC");
		ht.put(105, "Baramati");
		//ht.put(110, null);
		
		ht.put(101, "Nagar");
		System.out.println(ht);
		
		System.out.println(ht.get(103));
		
		System.out.println(ht.replace(102, "Bombay"));
		System.out.println(ht);
		
		
		
		
	}

}
