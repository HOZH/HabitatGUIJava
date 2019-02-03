package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static sample.Main.habitat;
import static sample.Main.theuser;

public class LoginPage {


    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button signupButton;
    @FXML
    private Button forgetpasswordButton;
    @FXML

    private Button staffloginButton;
    @FXML
    private Button loginButton;


    @FXML

    private Label status;


    public void doLogin() {

        System.out.println("11111");
    }


    //just for now
    public void gettoSignuppage(ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to sign up page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/signupPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void userLogin(ActionEvent event) throws IOException {


        boolean key = habitat.isUserPasswordMatched(usernameTextField.getText(), passwordField.getText());
        if (key) {

            theuser = habitat.getUsers().get(usernameTextField.getText());
            System.out.println(theuser.getUsername());
            System.out.println(theuser.getSecondaryKey());

            System.out.println("jump to user home page");

            Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userHomePage.fxml"));
            Scene homePageScene = new Scene(root);


            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.hide();
            appStage.setScene(homePageScene);
            appStage.show();


        } else {
            status.setText("cannot find the record");
        }


    }


    public void gettoforgetPasswordPage(ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to forget password page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/forgetPassword.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void staff(javafx.event.ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/staffHomePage.fxml"));
        Parent root = loader.load();
        StaffHomePage staffHomePage = loader.getController();
        staffHomePage.setReturnListView();
        staffHomePage.setShipListView();


        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();

    }


}
