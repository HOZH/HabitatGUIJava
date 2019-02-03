package sample.test;

import sample.core.Store;
import sample.core.User;
import sample.core.item;

import java.io.IOException;
import java.util.Iterator;

public class cartChecker {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Store theone = new Store();
        theone = theone.inputStreamHelper();


        System.out.println(theone.getToUserByUserName("user1"));

        User user = theone.getToUserByUserName("user1");

        Iterator<item> iter1 = user.getShoppingcart().iterator();

        System.out.println(iter1.next());

    }
}
