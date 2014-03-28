package com.asyrkett.synchronize;

import com.asyrkett.synchronize.screens.SplashScreen;
import com.badlogic.gdx.Game;

public class SynchronizeGame extends Game {
	
	public static final String TITLE = "Synchronize";
	public static final String VERSION = "0.0.0.0.1";
	
	@Override
	public void create() {
		setScreen(new SplashScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void render() {
		super.render();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}
}
