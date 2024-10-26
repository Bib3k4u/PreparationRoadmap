package TemplateDesignPattern;

public abstract class Beverage {
    public final void prepareRecipie(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiment()){
            addCondiments();
        }
    }


    public void boilWater(){
        System.out.println("Boiling Water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    //Steps that are different
    protected abstract void brew();
    protected abstract void addCondiments();

    protected  boolean customerWantsCondiment() {
        return true;
    }

}
