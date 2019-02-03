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
import sample.core.Order;

import java.io.IOException;
import java.util.Iterator;

import static sample.Main.*;

public class OrderHistoryPage {


    @FXML
    private Button truckingButton;

    @FXML
    private Button myaccount;

    @FXML
    private Button homepage;

    @FXML
    private Button request;

    @FXML
    private ListView theListView;

    @FXML
    private TextField trucking;


    public void requestReturn() {
        selectedOrder = (Order) theListView.getSelectionModel().getSelectedItem();
        selectedOrder.setReturning(true);
        habitat.getOrders().get(selectedOrder.getOrderNumber()).setReturning(true);
        System.out.println("set return true");
    }

    public void setTheListView() {

        Iterator<Order> iter1 = theuser.getOrderList().iterator();
        Iterator<Order> iter2 = theuser.getOrderList().iterator();
        Iterator<Order> iter3 = theuser.getOrderList().iterator();
        Iterator<Order> iter4 = theuser.getOrderList().iterator();

        while (iter1.hasNext()) {

            if (iter1.next().isReturned() != true)


            {
                theListView.getItems().addAll(iter2.next());
            } else {
                iter2.next();
            }


        }

    }

    public void truck() {

        //trucking.setText();
        //theitem = (item) theListView.getSelectionModel().getSelectedItem();
        selectedOrder = (Order) theListView.getSelectionModel().getSelectedItem();
        trucking.setText(String.valueOf(selectedOrder.getTruckingNumber()));
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


    public void returnMyAccount(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to my account page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/userAccountPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


}
