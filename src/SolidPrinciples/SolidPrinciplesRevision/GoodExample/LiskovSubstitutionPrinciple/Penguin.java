package SolidPrinciples.SolidPrinciplesRevision.GoodExample.LiskovSubstitutionPrinciple;

public class Penguin extends Bird{
    public void move(){
        System.out.println("Penguin can't fly");
    }
}
