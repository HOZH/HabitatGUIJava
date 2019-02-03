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

public class ChangePassword {


    @FXML
    private TextField newpassword;

    @FXML
    private TextField confirmnewpassword;

    @FXML
    private Button confirmButton;

    @FXML
    private Button returnButton;

    @FXML
    private Label status;

    public void confirm() {

        if (newpassword.getText().equals(confirmnewpassword.getText())) {
            theuser.setPassword(newpassword.getText());

            habitat.getUserLogin().put(theuser.getUsername(), theuser.getPassword());

            habitat.getToUserByUserName(theuser.getUsername()).setPassword(theuser.getPassword());
            status.setText("password changed");
        }


    }


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


}
