package SolidPrinciples.SolidPrinciplesRevision.BadExample.InterfaceSegregationPrinciple;

public class HumanWorker implements Worker{
    public void work(){
        System.out.println("Human works");
    }
    public void eat(){
        System.out.println("Human eats");
    }
}
