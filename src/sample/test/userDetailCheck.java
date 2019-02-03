package sample.test;

import sample.core.Store;
import sample.core.User;

import java.io.IOException;

import static sample.Main.habitat;

public class userDetailCheck {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        habitat = new Store();
        habitat = habitat.inputStreamHelper();


        User user = habitat.getUsers().get("user1");
        System.out.println(user.getPassword());
        System.out.println(user.getBillingAddress());
        System.out.println(user.getShippingAddress());
        System.out.println(user.getSecondaryKey());


        habitat.outputStreamHelper();
    }
}
