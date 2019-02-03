package sample.test;

import sample.core.Order;
import sample.core.Store;

import java.io.IOException;

public class OrderAddBackDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Store theone = new Store();

        //theone=theone.inputStreamHelper();
        // if(theone.getOrders()==new HashMap<Integer, Order>())

        Order order = new Order();
        theone.getOrders().put(1, order);


    }
}
