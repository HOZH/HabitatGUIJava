package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import sample.core.item;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import static sample.Main.theitem;
import static sample.Main.theuser;

public class itemPage {

    @FXML
    private Label status;

    @FXML
    private Label itemName;

    @FXML
    private Label priceLabel;


    @FXML


    private Button buyButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button addButton;


    @FXML


    private TextArea TextArea;


    public void setNameLabel() {
        itemName.setText(theitem.getName());
    }


    public void setPriceLabel() {

        priceLabel.setText(String.valueOf(theitem.getPrice()));
    }


    public void setTextArea() {
        TextArea.setText(theitem.getDescription());
    }


    public void jumptoPayemnt(ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to forget payment page");

        HashSet<item> tempSet = new HashSet<>();
        tempSet.add(theitem);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/paymentPage.fxml"));
        Parent root = loader.load();

        PaymentPage paymentPage = loader.getController();
        paymentPage.setShipping();
        paymentPage.setBilling();
        paymentPage.setItemlist(tempSet);
        Iterator<item> iter1 = tempSet.iterator();
        double subtotal = 0;
        while (iter1.hasNext()) {
            subtotal = subtotal + iter1.next().getPrice();
        }

        paymentPage.setSubtotalLabel(String.valueOf(subtotal));
        paymentPage.setTaxLabel(String.valueOf(subtotal * 0.08));
        paymentPage.setTotalLabel(String.valueOf(subtotal * 1.08+15));
        paymentPage.setShippingLabel("15");


        Scene homePageScene = new Scene(root);

        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void returnto(ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to home page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userHomePage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }

    public void addtoCart() {

        theuser.getShoppingcart().add(theitem);
        status.setText(theitem.getName());

    }


}
