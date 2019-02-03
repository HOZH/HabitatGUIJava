package sample.test;

import sample.core.Store;

import java.io.IOException;

import static sample.Main.habitat;

public class passwordTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        habitat = new Store();
        habitat = habitat.inputStreamHelper();


        String str = habitat.getUsers().get("user1").getPassword();
        System.out.println(str);


        boolean the = habitat.isUserPasswordMatched("user1", "1");
        System.out.println(habitat.getUsers().get("user1").getPassword().equals("1"));


        habitat.outputStreamHelper();
    }
}
