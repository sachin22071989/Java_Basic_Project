package com.core.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List al = new ArrayList();
		al.add(12);
		al.add(85);
		al.add(1);
		Iterator it = al.iterator();
		System.out.println(it.next());

		System.out.println(al);
		// al.clear();
		System.out.println(al);

		List ll = new LinkedList();
		ll.add("Sachin");
		ll.add("Kumar");
		ll.add(null);
		ll.add(ll);
		ll.add(al);
		System.out.println(ll);
		System.out.println(al);
		System.out.println("" + 5 + 3);

	}

}
