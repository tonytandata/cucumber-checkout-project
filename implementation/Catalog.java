package implementation;

public class Catalog {
    int itemPrice;
    public void add(String itemName, int itemPrice){
        this.itemPrice = itemPrice;
    }

    public int getPrice(String itemName){
        return itemPrice;
    }
}
