package StateDesignPattern;

public class TVContext implements State{
    State tvState;
    public void setState(State tvState){
        this.tvState = tvState;
    }
    public State getTvState() {
        return this.tvState;
    }
    @Override
    public void doAction(){
        this.tvState.doAction();
    }
}
