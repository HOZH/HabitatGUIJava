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

import java.io.IOException;
import java.util.Iterator;

import static sample.Main.habitat;

public class CheckItemsPage {


    @FXML
    private Button searchButton;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button returnButton;

    @FXML
    private TextField searchTextField;

    @FXML
    private ListView theListView;


    public void delete(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to staff delete page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/delete.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void add(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to staff add page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/add.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }


    public void search() {
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

            }


        }


    }


    public void returnHomePage(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to staff home page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/StaffHomePage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }
}
