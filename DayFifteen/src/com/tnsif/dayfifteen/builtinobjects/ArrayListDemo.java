package com.tnsif.dayfifteen.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list1=new ArrayList();  //dynamic binding
		
		System.out.println(list1.isEmpty());
		list1.add(10);
		list1.add(20);
		list1.add("Sakashi");
		list1.add("Aadra");
		list1.add(false);
		list1.add(true);
		list1.add(20);
		list1.add(12.4f);
		list1.add(10);
		System.out.println("List is "+ list1);
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		
		
	System.out.println(	"Is list contains 10 ? " +list1.contains(10));
	
	
	list1.remove(false);
	System.out.println("List is "+ list1);
	
	list1.remove(2);
	System.out.println("List is "+ list1);
	
	System.out.println(list1.remove(list1.lastIndexOf(20)));
	System.out.println("List is "+ list1);

	System.out.println(list1.indexOf(20));
	System.out.println("List is "+ list1);

//	Collections.sort(list1);  //RTE //ClassCastException
//	System.out.println("List is "+ list1);

	list1.clear();
	System.out.println("List is "+ list1);
	
	System.out.println("-------------------------------------------------------------------------------");
	//Generics
	
	List<String> names=new ArrayList<>();
	
	names.add("Dilip");
	names.add("Rushikesh");
	names.add("Shital");
	names.add("Aakash");
	names.add("Prachi");
    //names.add("23");
	names.add("Aakash");
	names.add("Dilip");
    System.out.println(names );
    
    Collections.reverse(names);
    System.out.println(names);
	
    
    System.out.println(names.contains("Dilip"));
    
    Collections.sort(names);
    System.out.println(names);
    
    Collections.reverse(names);
    System.out.println(names);
    
    //Traversing a list 
    
    Iterator<String> i=names.iterator();
    while(i.hasNext())
    {
    	String nm=i.next();
    	System.out.println(nm);
    	if(nm.equals("Prachi"))
    		i.remove();
    }

    System.out.println(names);
    
    ListIterator<String> li=names.listIterator(names.size());
    while(li.hasPrevious())
    {
    	String nm =li.previous();
    	System.out.println(nm);
    }
    

	
	
	
	
		
		
		
		
		
		
		
	}
}
