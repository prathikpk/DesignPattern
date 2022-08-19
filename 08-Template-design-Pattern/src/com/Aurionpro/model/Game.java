package com.Aurionpro.model;

public abstract class Game {
	abstract void startGame();
	abstract void endGame();
	abstract void result();
	
	public void play() {
		startGame();
		endGame();
		result();
	}
	
}