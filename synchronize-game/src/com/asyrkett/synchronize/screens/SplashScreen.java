package com.asyrkett.synchronize.screens;

import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.Tween;
import aurelienribon.tweenengine.TweenCallback;
import aurelienribon.tweenengine.TweenManager;

import com.asyrkett.synchronize.tweens.SpriteAccessor;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SplashScreen implements Screen {

	private SpriteBatch batch;
	private Texture backgroundTexture;
	private Texture titleTexture;
	private Sprite backgroundSprite;
	private Sprite titleSprite;
	private TweenManager tweenManager;
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		tweenManager.update(delta);
		
		batch.begin();
		//backgroundSprite.draw(batch);
		titleSprite.draw(batch);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void show() {
		batch = new SpriteBatch();
		
		tweenManager = new TweenManager();
		Tween.registerAccessor(Sprite.class, new SpriteAccessor());
		
		backgroundTexture = new Texture(Gdx.files.internal("data/background.png"));
		titleTexture = new Texture(Gdx.files.internal("data/title.png"));
		//texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		backgroundSprite = new Sprite(backgroundTexture);
		backgroundSprite.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		titleSprite = new Sprite(titleTexture);
		titleSprite.setPosition((Gdx.graphics.getWidth() - titleSprite.getWidth()) / 2, 
				(Gdx.graphics.getHeight() - titleSprite.getHeight()) / 2);
		
		//fade title in and out
		Tween.set(titleSprite, SpriteAccessor.ALPHA).target(0).start(tweenManager);
		Tween.to(titleSprite, SpriteAccessor.ALPHA, 2).target(1).repeatYoyo(1, 2).setCallback(new TweenCallback() {

			//after animation sequence, go to main menu screen
			@Override
			public void onEvent(int type, BaseTween<?> source) {
				((Game) Gdx.app.getApplicationListener()).setScreen(new MenuScreen());
			}
			
		}).start(tweenManager);
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