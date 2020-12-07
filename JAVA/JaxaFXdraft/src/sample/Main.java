package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("loginScene.fxml"));
        primaryStage.setTitle("Colour ITs management system");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}


//Noter
/*
** I FXML FILER**
    HUSK FREMOVER: fx:controller="sample.Controller"  i ydereste pane
    HUSK FREMOVER: prefHeight="400.0" prefWidth="640.0"
** I Controller & Main **

*/
