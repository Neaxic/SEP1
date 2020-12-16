package sample;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    static ReadWrite readWrite = new ReadWrite();
    static Projects ProjectsList = new Projects();

    private static Project ItemSelected;

    public static Project getItemSelected() {
        return ItemSelected;
    }

    public static void setItemSelected(Project itemSelected) {
        ItemSelected = itemSelected;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("loginScene.fxml"));
        primaryStage.setTitle("Colour ITs management system");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
        primaryStage.setResizable(false);

        for(int i = 0; i < readWrite.readProjects().getProjectsList().size(); i++){
            ProjectsList.addProject(readWrite.readProjects().getProjectsList().get(i));
        }
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