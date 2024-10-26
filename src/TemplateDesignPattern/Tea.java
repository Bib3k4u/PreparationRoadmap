package TemplateDesignPattern;

public class Tea extends Beverage{
    @Override
    public void brew(){
        System.out.println("Steeping the Tea...");
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
