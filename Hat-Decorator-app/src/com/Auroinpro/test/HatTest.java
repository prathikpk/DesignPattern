package com.Auroinpro.test;

import com.Auroinpro.model.GoldenHat;
import com.Auroinpro.model.StandardHat;

public class HatTest {

	public static void main(String[] args) {
		StandardHat stdhat=new StandardHat();
		GoldenHat goldenhat=new GoldenHat(stdhat);
		System.out.println(goldenhat.getName());
		System.out.println(goldenhat.getDescription());
		System.out.println(goldenhat.getPrice());
	}

}
