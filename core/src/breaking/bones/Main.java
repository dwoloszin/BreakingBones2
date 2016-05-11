package breaking.bones;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import breaking.bones.states.GameStateMenager;
import breaking.bones.states.MenuState;

public class Main extends Game {

	public  static final int WIDTH = 1200;
	public  static final int HEIGHT = 800;
	public static final String TITLE = "Breaking Bones";
	private GameStateMenager gameStateMenagerms;
	private SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();
		gameStateMenagerms = new GameStateMenager();
		Gdx.gl.glClearColor(0, 0, 0, 0);
		gameStateMenagerms.push(new MenuState(gameStateMenagerms));


	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameStateMenagerms.upadate(Gdx.graphics.getDeltaTime());
		gameStateMenagerms.render(batch);
	}
}
