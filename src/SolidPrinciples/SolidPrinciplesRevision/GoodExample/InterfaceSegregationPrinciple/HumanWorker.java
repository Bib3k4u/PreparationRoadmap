package SolidPrinciples.SolidPrinciplesRevision.GoodExample.InterfaceSegregationPrinciple;

public class HumanWorker implements Workable, Eatable{
    public void work(){
        System.out.println("Human Working");
    }
    public void eat(){
        System.out.println("Human eating");
    }
}
