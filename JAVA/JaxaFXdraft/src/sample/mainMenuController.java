package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainMenuController {
    ReadWrite readWrite = new ReadWrite();

    public void mainMenuCreateNew(ActionEvent event)   throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("CreatingProject.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    public void mainMenuProjectHistory(ActionEvent event) throws IOException, ClassNotFoundException {
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("ProjectHistory.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        System.out.println(readWrite.readProjects().getProjectsList().get(0).getName());
        window.setScene(nytVindue);
        window.show();


        //ProjectLabel.setText("Test");
        //ProjectLabel.setText(readFromFile.readProjects().getProjectsList().get(0).getName());
    }

    public void mainMenuSeeAll(ActionEvent event) throws IOException, ClassNotFoundException {
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("ProjectOverview.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(nytVindue);
        window.show();
    }

    public void mainMenuSearch(ActionEvent actionEvent)   throws IOException{

    }





}
