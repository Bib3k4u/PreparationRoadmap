package StateDesignPattern;

public class TVStartState implements State{
    @Override
    public void doAction(){
        System.out.println("Starting TV...");
    }
}
