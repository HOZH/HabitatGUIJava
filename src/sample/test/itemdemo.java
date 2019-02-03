package sample.test;

import sample.core.Store;
import sample.core.User;
import sample.core.item;

import java.io.IOException;
import java.util.HashSet;

public class itemdemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Store habitat = new Store();

        habitat = habitat.inputStreamHelper();
        // item item = habitat.getItems().get("baby powder");
        item item1 = new item();
        System.out.println(item1);
        User user = habitat.getUsers().get("user1");
        System.out.println(user.getPassword());
        HashSet<item> shoppingcart = new HashSet<>();
        shoppingcart.add(item1);
        System.out.println(shoppingcart.iterator().next());
//if(user.getShoppingcart()==shoppingcart)
        HashSet<item> uu = user.getShoppingcart();
        uu.add(new item());
        //status.setText(theitem.getName());
    }
}
