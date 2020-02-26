package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root,600, 300);

        primaryStage.setScene(scene);
        root.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        primaryStage.show();
    }


    public static void main(String[] args) {


        Field field = new Field();

//        field.print();
//        field.toggleTiles(13);
//        field.print();
        field.shuffle();
        field.print();
        field.toggleTiles(5);
        field.print();

//        launch(args);
    }
}
