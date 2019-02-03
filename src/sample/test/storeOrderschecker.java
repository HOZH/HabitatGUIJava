package sample.test;

import sample.core.Order;
import sample.core.Store;

import java.io.IOException;

public class storeOrderschecker {


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Store theone = new Store();
        theone = theone.inputStreamHelper();
//theone.getOrders().put(2,new Order());
        theone.getOrders().put(1, new Order());
        theone.getOrders().put(2, new Order());
        theone.getOrders().put(3, new Order());

        System.out.println(theone.getOrders().size());


        //System.out.println(theone.getOrders().get(0).getSubTotal());
        // theone.outputStreamHelper();


    }
}
