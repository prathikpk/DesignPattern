package com.Aurionpro.model;

public class Cricket extends Game {

	@Override
	void startGame() {
		System.out.println("Playing Game of Cricket");
	}

	@Override
	void endGame() {
		System.out.println("Cricket game finished");
		
	}

	@Override
	void result() {
       System.out.println("team 1 wins");		
	}

}
