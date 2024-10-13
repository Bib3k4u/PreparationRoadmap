package StrategyPatternRevision;

public class Main {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart();

        Item item1 = new Item("1234",1100);
        Item item2 = new Item("5678",900);

        cart.addItem(item1);
        cart2.addItem(item2);

        //pay by paypal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        //pay by credit card
        cart2.pay(new CreditCardStrategy("Bibek Jha", "1234 5678 9012 3456", "786", "11/19"));
    }
}
