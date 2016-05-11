package breaking.bones.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import breaking.bones.Main;

/**
 * Created by wolos on 11/05/2016.
 */
public class MenuState extends State {
    //private Texture background;
    private Texture texture_novojogo;
    private Texture texture_dificuldade;
    private Texture texture_ajuda;
    private Texture texture_sair;



    public MenuState(GameStateMenager gameStateMenager) {
        super(gameStateMenager);
        texture_novojogo = new Texture("novojogo.png");
        texture_dificuldade = new Texture("dificuldade.png");
        texture_ajuda = new Texture("ajuda.png");
        texture_sair = new Texture("sair.png");
    }

    @Override
    public void handleImput() {
        if(Gdx.input.justTouched()){
            gameStateMenager.push(new PlayState(gameStateMenager));
            dispose();

        }

    }

    @Override
    public void update(float dt) {
        handleImput();

    }

    @Override
    public void dispose() {
        texture_novojogo.dispose();
        texture_dificuldade.dispose();
        texture_ajuda.dispose();
        texture_sair.dispose();


    }

    @Override
    public void render(SpriteBatch sprite) {
        sprite.begin();
        sprite.draw(texture_novojogo,(Main.WIDTH/2) - texture_novojogo.getWidth()/2 ,Main.HEIGHT/2 + 100);
        sprite.draw(texture_dificuldade,(Main.WIDTH/2) - texture_dificuldade.getWidth()/2 ,Main.HEIGHT/2 + 40);
        sprite.draw(texture_ajuda,(Main.WIDTH/2) - texture_ajuda.getWidth()/2 ,Main.HEIGHT/2 - 20);
        sprite.draw(texture_sair,(Main.WIDTH/2) - texture_sair.getWidth()/2 ,Main.HEIGHT/2 - 80);
        sprite.end();
    }
}
