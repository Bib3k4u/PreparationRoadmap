package SolidPrinciples.SolidPrinciplesRevision.BadExample.LiskovSubstitutionPrinciple;

public class Penguin extends Bird{
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguin can't fly");
    }
}
