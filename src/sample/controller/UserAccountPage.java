package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class UserAccountPage {


    @FXML
    private Button orderHistoryButton;


    @FXML
    private Button returnButton;


    @FXML
    private Button signoutButton;


    @FXML
    private Button changeprofileButton;


    @FXML
    private Button changepasswordButton;


    public void signout(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("sign out");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/loginPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void checkOrderHistory(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to order history page");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/orderHistoryPage.fxml"));
        Parent root = loader.load();


        // Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/itemPage.fxml"));


        //itemPage itemPage = loader.getController();
        OrderHistoryPage orderHistoryPage = loader.getController();
        orderHistoryPage.setTheListView();

        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();

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


    public void changeProfile(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to change profile page");


        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/changeProfilePage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void changePassword(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to change password page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/changePassword.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


}
