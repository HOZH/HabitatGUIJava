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
import java.util.Iterator;

import static sample.Main.habitat;

public class Delete {


    // @FXML private Label id;

    @FXML
    private Label status;

    @FXML
    private TextField id;

    @FXML
    private Button returnButton;

    @FXML
    private Button deleteButton;


    public void returnHomePage(javafx.event.ActionEvent event) throws IOException, ClassNotFoundException {
        System.out.println("return to staff home page");

        Parent root = FXMLLoader.load(getClass().getResource("/sample/fxml/StaffHomePage.fxml"));
        Scene homePageScene = new Scene(root);


        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.hide();
        appStage.setScene(homePageScene);
        appStage.show();


    }

    public void deleteItem() {

        Integer key = Integer.valueOf(id.getText());

        Iterator<String> iter1 = habitat.getItems().keySet().iterator();
        Iterator<String> iter2 = habitat.getItems().keySet().iterator();
        Iterator<String> iter3 = habitat.getItems().keySet().iterator();
        Iterator<String> iter4 = habitat.getItems().keySet().iterator();
        Iterator<String> iter5 = habitat.getItems().keySet().iterator();

        while (iter1.hasNext()) {
            if (habitat.getItems().get(iter1.next()).getId() == key) {
                habitat.getInventory().getItemInventory().remove(habitat.getItems().get(iter3.next()).getId());
                habitat.getItems().remove(iter2.next());

                status.setText("item removed");
                break;
            } else {
                iter2.next();
                iter3.next();
            }


        }


    }


}
