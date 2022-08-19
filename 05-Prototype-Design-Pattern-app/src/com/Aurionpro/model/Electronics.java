package com.Aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Electronics implements Cloneable {
	private List<String> elec;
	
	 public Electronics() {
		    this.elec = new ArrayList<String>();
		  }

	public Electronics(List<String> list) {
		this.elec = list;
	}

	public void addData() {
		elec.add("Mobile");
		elec.add("Laptop");
		elec.add("Computer");
		elec.add("Camera");
		elec.add("Watch");
	}

	public List<String> getElectornicsList() {
		return this.elec;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();

		for (String s : this.getElectornicsList()) {
			tempList.add(s);
		}

		return new Electronics(tempList);
	}
}
