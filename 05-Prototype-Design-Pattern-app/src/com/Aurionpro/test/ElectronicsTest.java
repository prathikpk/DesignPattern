package com.Aurionpro.test;

import java.util.List;

import com.Aurionpro.model.Electronics;

public class ElectronicsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Electronics a = new Electronics();
		a.addData();
		System.out.println("Original list before clonning:"+a.getElectornicsList());
		System.out.println("---------------------------------------------------------------------");
		
		Electronics b = (Electronics) a.clone();
		List<String> list = b.getElectornicsList();
		list.add("Tablet");
		System.out.println(list);
		b.getElectornicsList().remove("Mobile");
		System.out.println(list);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Original list after clonning:"+a.getElectornicsList());
	}

}
