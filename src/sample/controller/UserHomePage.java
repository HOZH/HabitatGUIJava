package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.core.item;

import java.io.IOException;
import java.util.Iterator;

import static sample.Main.*;

public class UserHomePage {


    @FXML

    private TextField searchTextField;

    @FXML
    private Button myaccountButton;


    @FXML
    private ListView theListView;

    @FXML
    private Button searchButton;

    @FXML
    private Button getInButton;


    public void gettoMyAccount(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("jump to my account page");
        System.out.println(theuser.getUsername());
        System.out.println(theuser.getSecondaryKey());

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userAccountPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void searchbyKeyword() {
        String keyword = searchTextField.getText();
        System.out.println(searchTextField.getText());
//theListView.getItems().add("333");

        Iterator<String> iter1 = habitat.getItems().keySet().iterator();

        Iterator<String> iter2 = habitat.getItems().keySet().iterator();

        Iterator<String> iter3 = habitat.getItems().keySet().iterator();

        Iterator<String> iter4 = habitat.getItems().keySet().iterator();


        while (iter1.hasNext()) {

            if (iter1.next().toUpperCase().contains(keyword.toUpperCase())) {
                System.out.println(iter2.next());
                theListView.getItems().addAll(habitat.getItems().get(iter3.next()));
                System.out.println(habitat.getItems().get(iter4.next()).getName());
                System.out.println("found");
            } else {
                iter2.next();
                iter3.next();
                iter4.next();
                System.out.println("not found");
            }


        }


    }


    public void getto(javafx.event.ActionEvent event) throws IOException {


        System.out.println(theListView.getSelectionModel().getSelectedItem());
        theitem = (item) theListView.getSelectionModel().getSelectedItem();
        System.out.println(theitem.getName());


        System.out.println("jump to item page");
        System.out.println(theuser.getUsername());
        System.out.println(theuser.getSecondaryKey());


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/itemPage.fxml"));
        Parent root = loader.load();


        // Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/itemPage.fxml"));


        itemPage itemPage = loader.getController();
        //itemPage.dosomething();
        itemPage.setNameLabel();
        itemPage.setPriceLabel();
        itemPage.setTextArea();
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();

    }

    public void jumptocart(javafx.event.ActionEvent event) throws IOException {

//thecart=theuser.getShoppingcart();
        //  System.out.println(theListView.getSelectionModel().getSelectedItem());
        // theitem = (item) theListView.getSelectionModel().getSelectedItem();
        //  System.out.println(theitem.getName());


        System.out.println("jump to shopping cart page");
        System.out.println(theuser.getUsername());
        System.out.println(theuser.getSecondaryKey());


        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/cartPage.fxml"));
        Parent root = loader.load();


        // Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/itemPage.fxml"));


        CartPage cartPage = loader.getController();
        cartPage.setTheListView();
        cartPage.setSubtotalLabel();
        //itemPage.dosomething();
        //itemPage.setNameLabel();
        // itemPage.setPriceLabel();
        //  itemPage.setTextArea();
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();

    }

}




