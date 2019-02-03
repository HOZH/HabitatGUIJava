package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static sample.Main.habitat;
import static sample.Main.theuser;


public class ChangeProfilePage {


    @FXML
    private TextField shippingAddress;


    @FXML
    private TextField billingAddress;


    @FXML
    private TextField secondarykeyTextField;


    @FXML
    private Label status;


    @FXML
    private Button confirmButton;


    @FXML
    private Button returnButton;


    public void returntoMyAccount(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to my account page");
        System.out.println(theuser.getUsername());
        System.out.println(theuser.getSecondaryKey());

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userAccountPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }

    public void confirm() {
        status.setText("profile changed");
        theuser.setShippingAddress(shippingAddress.getText());
        theuser.setBillingAddress(billingAddress.getText());
        theuser.setSecondaryKey(secondarykeyTextField.getText());
        habitat.getToUserByUserName(theuser.getUsername()).setSecondaryKey(theuser.getSecondaryKey());
        habitat.getToUserByUserName(theuser.getUsername()).setBillingAddress(theuser.getBillingAddress());
        habitat.getToUserByUserName(theuser.getUsername()).setShippingAddress(theuser.getShippingAddress());
    }


}

