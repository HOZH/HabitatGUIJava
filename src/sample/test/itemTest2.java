package sample.test;

import sample.core.Store;
import sample.core.User;
import sample.core.item;

import java.io.IOException;
import java.util.HashSet;

public class itemTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Store theone = new Store();

        User user = new User();
        theone.getUsers().put("user", user);
        System.out.println(theone.getUsers().get("user"));


        theone = theone.inputStreamHelper();
        User user1 = theone.getUsers().get("user1");


        HashSet<item> items = user1.getShoppingcart();
        System.out.println(items);
        items.add(new item());
        System.out.println(items.iterator().next());
    }


}
