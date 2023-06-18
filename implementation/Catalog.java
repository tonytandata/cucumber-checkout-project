package implementation;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    Map<String, Integer> itemCatalog;
    public Catalog(){
        itemCatalog = new HashMap<>();
    }
    public void add(String itemName, int itemPrice){
        itemCatalog.put(itemName, itemPrice);
    }

    public int getPrice(String itemName){
        return itemCatalog.get(itemName);
    }
}
