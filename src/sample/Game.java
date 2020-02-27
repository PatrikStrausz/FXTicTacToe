package sample;

public class Game {

    private Field field;
    private State state;

    public Game() {
        this.field = new Field();
        this.state = State.READY;
    }

    public void start(){
        if (state==State.READY) {
            state = State.RUNNING;
            field = new Field();
            field.shuffle();
            field.print();
        }
    }

    public void reset(){
        if (state != State.READY) {
            state = State.READY;
            this.field = null;
        }
    }

    public void end(){
        if (state == State.RUNNING) {
            state = State.OVER;
        }
    }

    public void nextMove(int code){
        if(state == State.RUNNING){
            field.toggleTiles(code);
            field.print();
            if(field.isWinner()){
                end();
            }
        }
    }

    public Field getField() {
        return field;
    }
}
