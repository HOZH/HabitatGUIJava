package sample.test;

import sample.core.Order;

import java.io.IOException;

import static sample.Main.theorder;

public class orderNumberTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println(theorder.getOrderNumber());
        theorder = new Order();
        System.out.println(theorder.getOrderNumber());
        theorder = new Order();
        System.out.println(theorder.getOrderNumber());

    }
}
