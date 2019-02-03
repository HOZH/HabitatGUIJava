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

import static sample.Main.habitat;
import static sample.Main.selectedOrder;

public class StaffHomePage {


    @FXML
    private ListView returnListView;

    @FXML
    private ListView shipListView;

    @FXML
    private Button cancelButton;

    @FXML
    private Button checkitemButton;

    @FXML
    private TextField truckingTextField;

    @FXML
    private Button signoutButton;

    @FXML
    private Button shipButton;


    public void check(javafx.event.ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/fxml/checkItemsPage.fxml"));
        Parent root = loader.load();
        CheckItemsPage checkitemsPage = loader.getController();


        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();

    }


    public void cancel() {
        selectedOrder = (Order) returnListView.getSelectionModel().getSelectedItem();
        selectedOrder.setReturned(true);
        selectedOrder.setReturning(false);


        Iterator<Order> iter1 = habitat.getToUserByUserName(selectedOrder.getUsername()).getOrderList().iterator();
        Iterator<Order> iter2 = habitat.getToUserByUserName(selectedOrder.getUsername()).getOrderList().iterator();
        Iterator<Order> iter3 = habitat.getToUserByUserName(selectedOrder.getUsername()).getOrderList().iterator();
        while (iter1.hasNext()) {

            if (iter1.next().getUsername() == selectedOrder.getUsername()) {
                iter2.next().setReturned(true);
                iter3.next().setReturning(false);

            } else {
                iter2.next();
                iter3.next();
            }


        }

    }


    public void ship() {
        selectedOrder = (Order) shipListView.getSelectionModel().getSelectedItem();
        selectedOrder.setShipped(true);
        selectedOrder.setTruckingNumber(truckingTextField.getText());

        Iterator<Order> iter1 = habitat.getToUserByUserName(selectedOrder.getUsername()).getOrderList().iterator();
        Iterator<Order> iter2 = habitat.getToUserByUserName(selectedOrder.getUsername()).getOrderList().iterator();
        Iterator<Order> iter3 = habitat.getToUserByUserName(selectedOrder.getUsername()).getOrderList().iterator();
        Iterator<Order> iter4 = habitat.getToUserByUserName(selectedOrder.getUsername()).getOrderList().iterator();

        while (iter1.hasNext()) {

            if (iter1.next().getUsername() == selectedOrder.getUsername()&&iter4.next().getOrderNumber()==selectedOrder.getOrderNumber()
                    ) {
                iter2.next().setShipped(true);
                iter3.next().setTruckingNumber(truckingTextField.getText());


            } else {
                iter2.next();
                iter3.next();

            }


        }


    }


    public void signout(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("sign out");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/loginPage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void setReturnListView() {
        Iterator<Integer> iter1 = habitat.getOrders().keySet().iterator();
        Iterator<Integer> iter2 = habitat.getOrders().keySet().iterator();


        while (iter1.hasNext()) {
            if (habitat.getOrders().get(iter1.next()).isReturning() == true)


            {
                returnListView.getItems().addAll(habitat.getOrders().get(iter2.next()));
            } else {
                iter2.next();
            }


        }


    }


    public void setShipListView() {


        Iterator<Integer> iter1 = habitat.getOrders().keySet().iterator();
        Iterator<Integer> iter2 = habitat.getOrders().keySet().iterator();


        while (iter1.hasNext()) {
            if (habitat.getOrders().get(iter1.next()).isShipped() == false)


            {
                shipListView.getItems().addAll(habitat.getOrders().get(iter2.next()));
            } else {
                iter2.next();
            }


        }
    }

}
