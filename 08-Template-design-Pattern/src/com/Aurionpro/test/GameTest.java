package com.Aurionpro.test;

import com.Aurionpro.model.Cricket;
import com.Aurionpro.model.Football;
import com.Aurionpro.model.Game;

public class GameTest {

	public static void main(String[] args) {
     Game game=new Cricket();
     game.play();
     System.out.println("--------------");
     Game game1=new Football();
     game1.play();
     
	}

}
