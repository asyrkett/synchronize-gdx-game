package com.asyrkett.synchronize.screens;

import com.asyrkett.synchronize.SynchronizeGame;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SplashScreen implements Screen {

	private SynchronizeGame game;
	private SpriteBatch batch;
	private Texture backgroundTexture;
	private Texture titleTexture;
	private Sprite backgroundSprite;
	private Sprite titleSprite;
	
	public SplashScreen(SynchronizeGame game) {
		this.game = game;
	}
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		backgroundSprite.draw(batch);
		titleSprite.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		batch = new SpriteBatch();
		
		backgroundTexture = new Texture(Gdx.files.internal("data/background.png"));
		titleTexture = new Texture(Gdx.files.internal("data/title.png"));
		//texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		backgroundSprite = new Sprite(backgroundTexture);
		backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		titleSprite = new Sprite(titleTexture);
		titleSprite.setPosition((Gdx.graphics.getWidth() - titleSprite.getWidth()) / 2, 
				(Gdx.graphics.getHeight() - titleSprite.getHeight()) / 2);
	}

	@Override
	public void hide() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {
		batch.dispose();
		backgroundTexture.dispose();
		titleTexture.dispose();
	}

}