package SolidPrinciples.SolidPrinciplesRevision.GoodExample.LiskovSubstitutionPrinciple;

public class Sparrow extends Bird{
    @Override
    public void move(){
        System.out.println("Sparrow fly");
    }
}
