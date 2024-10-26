package StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        TVContext tvContext = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        tvContext.setState(tvStartState);
        tvContext.doAction();

        tvContext.setState(tvStopState);
        tvContext.doAction();
    }
}
