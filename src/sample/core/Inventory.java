package sample.core;

import java.io.Serializable;
import java.util.HashMap;

public class Inventory implements Serializable {


    private HashMap<Integer, Integer> itemInventory = new HashMap<Integer, Integer>();

    public HashMap<Integer, Integer> getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(HashMap<Integer, Integer> itemInventory) {
        this.itemInventory = itemInventory;
    }
}
