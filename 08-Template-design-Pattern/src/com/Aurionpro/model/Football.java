package com.Aurionpro.model;

public class Football extends Game {

	@Override
	void startGame() {
		System.out.println("Playing Game of Football");
	}

	@Override
	void endGame() {
		System.out.println("Football game finished");
	}

	@Override
	void result() {
		System.out.println("Team 2 wins");
	}

}
