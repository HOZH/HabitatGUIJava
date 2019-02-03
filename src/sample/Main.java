package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.core.Order;
import sample.core.Store;
import sample.core.User;
import sample.core.item;

import java.io.IOException;
import java.util.List;

public class Main extends Application {

    public static Store habitat = new Store();
    public static User theuser;
    public static item theitem;
    public static List<item> thecart;
    public static Order theorder = new Order();
    public static Order selectedOrder;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        habitat = habitat.inputStreamHelper();

        launch(args);
        habitat.outputStreamHelper();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/loginPage.fxml"));


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
