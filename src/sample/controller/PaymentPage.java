package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.core.item;

import java.io.IOException;
import java.util.HashSet;

import static sample.Main.*;


public class PaymentPage {


    @FXML
    private TextField shipping;

    @FXML
    private TextField billing;

    @FXML
    private TextField creditCard;

    @FXML
    private TextField pin;

    @FXML
    private Label shippingLabel;

    @FXML
    private Label subtotalLabel;

    @FXML
    private Label taxLabel;

    @FXML
    private Label totalLabel;

    @FXML
    private Button changeButton;

    @FXML
    private Button returnButton;

    @FXML
    private Button completeButton;

    public void change() {
        shipping.setEditable(true);
        billing.setEditable(true);

    }


    // todo was using to confirm change of shipping/billing addresses might not need anymore public void confirm (){}

    public void setShipping() {

        shipping.setText(theuser.getShippingAddress());


        // shipping.setText();


    }


    public void returnHomePage(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to home page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userHomePage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }
/*
 theorder.setBillingAddress(billing.getText());
        theorder.setCreditCardNumber(creditCard.getText());
        theorder.setShippingAddress(shipping.getText());
        theorder.setSubTotal(Double.valueOf(subtotalLabel.getText()));
        theorder.setTotal(Double.valueOf(subtotalLabel.getText())*1.08);
 */


    public void complete(ActionEvent event) throws IOException, ClassNotFoundException ,NumberFormatException{
       if(creditCard.getText().isEmpty()||pin.getText().isEmpty())
        {

        }else{

            theorder.setUsername(theuser.getUsername());
        theorder.setOrderNumber(habitat.getOrders().size());
        theorder.setBillingAddress(billing.getText());
        theorder.setCreditCardNumber(creditCard.getText());
        theorder.setShippingAddress(shipping.getText());
        theorder.setSubTotal(Double.valueOf(subtotalLabel.getText()));
        theorder.setTotal(Double.valueOf(subtotalLabel.getText()) * 1.08+15);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/OrderPage.fxml"));
        Parent root = loader.load();

        OrderPage orderPage = loader.getController();
        orderPage.setOrderDetail();


        Scene homePageScene = new Scene(root);

        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();}


    }

    public void setBilling() {

        billing.setText(theuser.getBillingAddress());
    }


    public void setItemlist(HashSet<item> lalala) {
        theorder.setItemList(lalala);
    }


    public void setSubtotalLabel(String subtotal) {
        subtotalLabel.setText(subtotal);

    }


    public void setTaxLabel(String tax) {
        taxLabel.setText(tax);

    }

    public void setTotalLabel(String total) {
        totalLabel.setText(total);

    }

    public void setShippingLabel(String fee) {
        shippingLabel.setText(fee);

    }

}
