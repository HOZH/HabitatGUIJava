package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import sample.core.Order;

import java.io.IOException;

import static sample.Main.*;

public class OrderPage {


    @FXML
    private TextArea textArea;


    @FXML
    private Button returnButton;


    public void returnHomgPage(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to home page");

        theuser.getOrderList().add(theorder);
        int i = theorder.getOrderNumber();
        habitat.getOrders().put(i, theorder);
        System.out.println(theuser.getOrderList().size());
        System.out.println(habitat.getOrders().size());

        theorder = new Order();
        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userHomePage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void setOrderDetail() {

        String orderDetail = "";

        orderDetail = "\n\t\t\tUsername: " + theorder.getUsername() + "\n\t\t\tShipping address: " + theorder.getShippingAddress() + "\n\t\t\tBilling address: " + theorder.getBillingAddress()
                + "\n\t\t\tCredit card/GC: " + theorder.getCreditCardNumber() + "\n\t\t\tSubTotal: " + theorder.getSubTotal() +
                "\n\t\t\tTotal: " + theorder.getTotal() + "\n\t\t\tOrder number: " + theorder.getOrderNumber();
        //todo finish this later

        textArea.setText(orderDetail);


    }


}
