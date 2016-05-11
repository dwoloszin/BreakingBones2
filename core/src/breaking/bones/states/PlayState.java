package breaking.bones.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import breaking.bones.Main;
import breaking.bones.sprites.Player;

/**
 * Created by wolos on 11/05/2016.
 */
public class PlayState extends State {
    private Player player = new Player(10,10);


    public PlayState(GameStateMenager gameStateMenager) {
        super(gameStateMenager);

        //Alterar para a camera seguir o jogador
        cam.setToOrtho(false, Main.WIDTH/2,Main.HEIGHT/2);
    }

    @Override
    public void handleImput() {

    }

    @Override
    public void update(float dt) {
        handleImput();
        player.update(dt);

    }

    @Override
    public void render(SpriteBatch sprite) {
        sprite.setProjectionMatrix(cam.combined);
        sprite.begin();
        sprite.draw(player.getPlayerTexture(),player.getPosition().x,player.getPosition().y);
        sprite.end();

    }

    @Override
    public void dispose() {

    }
}
