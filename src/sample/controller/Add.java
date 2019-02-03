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
import sample.core.item;

import java.io.IOException;
import java.util.Iterator;

import static sample.Main.habitat;

public class Add {

    @FXML
    private TextField id;

    @FXML
    private TextField price;

    @FXML
    private TextField name;

    @FXML
    private TextField description;

    @FXML
    private TextField amount;

    @FXML
    private Button returnButton;

    @FXML
    private Button addButton;

    @FXML
    private Label status;


    public void addItem() {

        item item = new item();
        item.setId(Integer.valueOf(id.getText()));
        item.setDescription(description.getText());
        item.setName(name.getText());
        item.setPrice(Double.valueOf(price.getText()));

        Integer num = Integer.valueOf(amount.getText());
        Iterator<String> iter1 = habitat.getItems().keySet().iterator();
        Iterator<String> iter2 = habitat.getItems().keySet().iterator();
        Iterator<String> iter3 = habitat.getItems().keySet().iterator();
        boolean ifUnique = true;

        while (iter1.hasNext()) {
            if (habitat.getItems().get(iter1.next()).getId() == item.getId()) {
                ifUnique = false;
                break;
            }
        }


        if (item.getName() != null && num != 0 && ifUnique == true && num == (int) num) {
            habitat.getItems().put(item.getName(), item);
            habitat.getInventory().getItemInventory().put((Integer) item.getId(), num);
            status.setText("item added");
        } else {
            status.setText("check your input");
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
