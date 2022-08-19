package com.Aurionpro.test;

import com.Aurionpro.model.CarService;
import com.Aurionpro.model.Oilchange;
import com.Aurionpro.model.WheelAlign;

public class CarServiceTest {

	public static void main(String[] args) {
		CarService car=new CarService();
		Oilchange oilobj=new Oilchange(car);
		WheelAlign wheelobj=new WheelAlign(oilobj);
		System.out.println(wheelobj.getCost());
		System.out.println(wheelobj.getServiceDetails());

	}

}
