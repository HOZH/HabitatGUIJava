package sample.test;

import sample.core.Store;

import java.io.IOException;

public class generalJavaCodeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Store lol = new Store();
        lol = lol.inputStreamHelper();
        lol.outputStreamHelper();


    }
}
