package TemplateDesignPattern;

public class Coffee extends Beverage{
    @Override
    public void brew(){
        System.out.println("Brewing the Coffee...");
    }
    @Override
    public void addCondiments(){
        System.out.println("Adding the Condiments...");
    }
    @Override
    public boolean customerWantsCondiment(){
        return true;
    }
}
