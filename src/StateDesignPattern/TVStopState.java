package StateDesignPattern;

public class TVStopState implements State{
    @Override
    public void doAction(){
        System.out.println("Stopping TV...");
    }
}
