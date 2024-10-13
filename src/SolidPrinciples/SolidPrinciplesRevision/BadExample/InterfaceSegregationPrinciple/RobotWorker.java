package SolidPrinciples.SolidPrinciplesRevision.BadExample.InterfaceSegregationPrinciple;

public class RobotWorker implements Worker{
    public void work(){
        System.out.println("Robot works");
    }
    public void eat(){
        throw new UnsupportedOperationException();
    }
}
