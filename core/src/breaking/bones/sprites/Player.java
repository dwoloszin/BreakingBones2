package breaking.bones.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

import breaking.bones.Main;
import breaking.bones.states.PlayState;

/**
 * Created by wolos on 11/05/2016.
 */
public class Player {
    private static final int GRAVITY = 0;
    private Vector3 position;
    private Vector3 velocity;
    private Texture player;


    public Player(int x, int y){
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0); // deixar implementando para futuras altera;óes
        player = new Texture("player1.png");

    }

    public Vector3 getPosition() {
        return position;
    }

    public void setPosition(Vector3 position) {
        this.position = position;
    }

    public Texture getPlayerTexture() {
        return player;
    }



    public void update(float dt){
        velocity.add(0,GRAVITY,0);
        velocity.scl(dt);
    }

    public void moverPlayer() {


    }




}
