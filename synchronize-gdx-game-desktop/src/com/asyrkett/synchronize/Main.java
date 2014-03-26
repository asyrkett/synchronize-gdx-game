package com.asyrkett.synchronize;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Synchronize";
		cfg.useGL30 = false;
		cfg.width = 1000;
		cfg.height = 750;
		new LwjglApplication(new SynchronizeGame(), cfg);
	}
}
