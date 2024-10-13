package StrategyPatternRevision;

public class Item {
    String uspCode;
    int price;

    public Item(String uspCode, int price){
        this.uspCode = uspCode;
        this.price = price;
    }
    public String getUspCode(){
        return uspCode;
    }
    public int getPrice(){
        return price;
    }
}
