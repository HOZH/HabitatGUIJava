package sample.test;

import sample.core.Store;

import java.io.IOException;
import java.util.Iterator;

import static sample.Main.habitat;

public class itemControlTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        habitat = new Store();
        habitat = habitat.inputStreamHelper();


        Iterator<String> iter1 = habitat.getItems().keySet().iterator();

        Iterator<String> iter2 = habitat.getItems().keySet().iterator();

        Iterator<String> iter3 = habitat.getItems().keySet().iterator();

        Iterator<String> iter4 = habitat.getItems().keySet().iterator();


        habitat.getItems().get("baby powder").getName();


        System.out.println(habitat.getItems().get("baby powder").getPrice());
        System.out.println(habitat.getItems().get("baby powder").getDescription());
        System.out.println(habitat.getItems().get("baby powder").getName());


        System.out.println(iter1.next());


    }
}
