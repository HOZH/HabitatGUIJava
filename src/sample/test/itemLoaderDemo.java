package sample.test;

import sample.core.Store;
import sample.core.item;

import java.io.IOException;

import static sample.Main.habitat;

public class itemLoaderDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        habitat = new Store();
        habitat = habitat.inputStreamHelper();
        item item1 = new item();
        item1.setId(1597);
        item1.setDescription("for baby use only");
        item1.setName("baby powder");
        item1.setPrice(2.25);


        habitat.getItems().put(item1.getName(), item1);
        habitat.getInventory().getItemInventory().put((Integer) item1.getId(), 1);

        //System.out.println(habitat.getItems().get(""));


        habitat.outputStreamHelper();


    }
}
