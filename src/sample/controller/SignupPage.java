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
import sample.core.User;

import java.io.IOException;
import java.util.Iterator;

import static sample.Main.habitat;

public class SignupPage {


    @FXML
    private TextField nameTextField;


    @FXML
    private TextField shippingAddress;


    @FXML

    private TextField billingAddress;


    @FXML
    private TextField usernameTextField;


    @FXML
    private TextField passwordTextField;


    @FXML
    private TextField passwordConfirmTextField;


    @FXML
    private TextField secondaryKeyTextField;


    @FXML
    private Button confirmButton;
    @FXML
    private Button returnButton;


    @FXML
    private Label status;


    public void gettologin(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to sign up page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/loginPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public boolean isUsernameUnique(String usernameinput) {

        Iterator<String> iter1 = habitat.getUsers().keySet().iterator();
        Iterator<String> iter2 = habitat.getUsers().keySet().iterator();
        while (iter1.hasNext()) {
            if (iter1.next().equals(usernameinput)) {
                status.setText("the username is not unique, try again");
                return false;
            }


        }
        return true;
    }


    public void signUp() {

        if (isUsernameUnique(usernameTextField.getText())) {
            if (passwordTextField.getText().equals(passwordConfirmTextField.getText()))


            {

                User currentUser = new User();
                currentUser.setName(nameTextField.getText());
                currentUser.setShippingAddress(shippingAddress.getText());
                currentUser.setBillingAddress(billingAddress.getText());
                currentUser.setUsername(usernameTextField.getText());
                currentUser.setPassword(passwordConfirmTextField.getText());
                currentUser.setSecondaryKey(secondaryKeyTextField.getText());
                habitat.getUsers().put(currentUser.getUsername(), currentUser);
                habitat.getUserLogin().put(currentUser.getUsername(), currentUser.getPassword());
                System.out.println(habitat.getUsers().size());
                Iterator<String> iter1 = habitat.getUsers().keySet().iterator();
                while (iter1.hasNext()) {
                    System.out.println(iter1.next()
                    );
                }

                status.setText(String.valueOf(habitat.getUsers().size()));
            } else status.setText("the password you input first time is not match the password you input second time");


        }
    }


}
