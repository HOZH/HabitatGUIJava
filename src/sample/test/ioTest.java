package sample.test;

import sample.core.Store;
import sample.core.User;

import java.io.IOException;
import java.util.Iterator;

import static sample.Main.habitat;

public class ioTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        habitat = new Store();
        // habitat=habitat.inputStreamHelper();
        //user3.setUsername("user2");
        // user3.setPassword("3");
        // user3.setSecondaryKey("cao");
//habitat.getUsers().put("user3",user3);
        Iterator<String> iter1 = habitat.getUsers().keySet().iterator();
        Iterator<String> iter2 = habitat.getUsers().keySet().iterator();

        while (iter1.hasNext()) {

            System.out.println(iter1.next());
            System.out.println(habitat.getUsers().get(iter2.next()).getPassword());
        }


        System.out.println(habitat.getUsers().size());
        habitat.outputStreamHelper();


    }
}
