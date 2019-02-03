package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import sample.core.item;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import static sample.Main.theuser;

public class CartPage {


    @FXML
    private ListView theListView;


    @FXML
    private Button deleteButton;

    @FXML
    private Button checkoutButton;

    @FXML
    private Button returnButton;

    @FXML
    private Label subtotalLabel;


    public void delete() {
    }


    //public void returnHomePage(){}

    public void returHomePage(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to home page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userHomePage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    // public void checkout (){}

    public void checkout(ActionEvent event) throws IOException, ClassNotFoundException {


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/paymentPage.fxml"));
        Parent root = loader.load();

        PaymentPage paymentPage = loader.getController();
        paymentPage.setShipping();
        paymentPage.setBilling();
        paymentPage.setItemlist(theuser.getShoppingcart());


        Iterator<item> iter1 = theuser.getShoppingcart().iterator();
        double subtotal = 0;
        while (iter1.hasNext()) {
            subtotal = subtotal + iter1.next().getPrice();
        }

        paymentPage.setSubtotalLabel(String.valueOf(subtotal));
        paymentPage.setTaxLabel(String.valueOf(subtotal * 0.08));
        paymentPage.setTotalLabel(String.valueOf(subtotal * 1.08+15));
        paymentPage.setShippingLabel("15");
        theuser.setShoppingcart( new HashSet<item>());


        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void setSubtotalLabel() {
        //todo don't forget to implement this


        Iterator<item> iter1 = theuser.getShoppingcart().iterator();
        Iterator<item> iter2 = theuser.getShoppingcart().iterator();
        Iterator<item> iter3 = theuser.getShoppingcart().iterator();
        double subtotal = 0;
        while (iter1.hasNext()) {
            subtotal = subtotal + iter1.next().getPrice();
        }
        subtotalLabel.setText("Subtotal:\t" + String.valueOf(subtotal));

    }


    public void setTheListView() {
        theListView.getItems().addAll(theuser.getShoppingcart());
    }


}
