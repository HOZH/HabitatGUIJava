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
import sample.core.User;

import java.io.IOException;

import static sample.Main.habitat;


public class ForgetPassword {


    @FXML
    private TextField usernameTextField;


    @FXML
    private TextField secondarykeyField;


    @FXML
    private Label status;


    @FXML
    private Button confirmButton;

    @FXML
    private Button returnButton;


    public void confirm() {
        User currentUser = habitat.getToUserByUserName(usernameTextField.getText());
        if (currentUser != null) {

            if (currentUser.getSecondaryKey().equals(secondarykeyField.getText())) {
                status.setText("your password is " + currentUser.getPassword());


            } else status.setText("your input were not matched in our database");

        } else {
            status.setText("cannot find the record of this username in our database");
        }
    }


    public void returntoLogin(ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to forget password page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/loginPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }

}
