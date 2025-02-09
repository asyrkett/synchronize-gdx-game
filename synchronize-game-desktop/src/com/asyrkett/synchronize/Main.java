package com.asyrkett.synchronize;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = SynchronizeGame.TITLE + " " + SynchronizeGame.VERSION;
		cfg.vSyncEnabled = true;
		cfg.useGL30 = false;
		cfg.width = 800;
		cfg.height = 600;
		
		new LwjglApplication(new SynchronizeGame(), cfg);
	}
}
