package com.main;

import com.sabrewulf.engine.application.Application;

public class Main extends Application
{
	public Main()
	{
		super(800, 600, 1, "Test", false, false);
		
		TestState state = new TestState(this);
		stateManager.addState(state);
		
		stateManager.setCurrentState(state);
	}
	
	public static void main(String[] args) {
		Main game = new Main();
		game.run();
	}	
}
