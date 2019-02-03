package sample.test;

import sample.core.Store;

import java.io.IOException;

public class booleanTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Store theone = new Store();

        theone = theone.inputStreamHelper();
        System.out.println(theone.getOrders().size());
        System.out.println(theone.getOrders().get(0).isReturning());
        System.out.println(theone.getOrders().get(0).isShipped());
    }
}
