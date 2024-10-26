package TemplateDesignPattern;

public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        System.out.println("\nMaking tea...");
        tea.prepareRecipie();
        System.out.println();
        Beverage coffee = new Coffee();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipie();
        System.out.println();
    }
}
