package breaking.bones.States;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by wolos on 11/05/2016.
 */
public class GameStateMenager {
    private Stack<State> states;

    public GameStateMenager(){
        states = new Stack<State>();
    }


    public void push(State state){
        states.push(state);

    }

    public void pop (){
        states.pop();

    }

    public void get(State state){
        states.pop();
        states.push(state);

    }

    public void upadate (float dt){
        states.peek().update(dt);


    }

    public void render(SpriteBatch sb) {
        states.peek().render(sb);

    }

}
