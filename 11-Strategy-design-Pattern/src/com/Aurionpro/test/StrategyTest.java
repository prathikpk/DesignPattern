package com.Aurionpro.test;

import com.Aurionpro.model.AddOperation;
import com.Aurionpro.model.MultiplyOperation;
import com.Aurionpro.model.StrategyOperation;

public class StrategyTest {

	public static void main(String[] args) {
	StrategyOperation op=new StrategyOperation(new AddOperation());
	System.out.println(op.doOperation(20, 10));
	op.setOperation(new MultiplyOperation());
	System.out.println(op.doOperation(20, 10));
	}

}
