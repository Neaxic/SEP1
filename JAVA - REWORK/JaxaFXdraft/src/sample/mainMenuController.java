package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class mainMenuController {

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
        window.setScene(nytVindue);
        window.show();


        //ProjectLabel.setText("Test");
        //ProjectLabel.setText(readFromFile.readProjects().getProjectsList().get(0).getName());
    }

    public void mainMenuSearch(ActionEvent event)   throws IOException{
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("searchMenu.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(nytVindue);
        window.show();
    }


    public void mainMenuSearchCol(ActionEvent event) throws IOException {
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("searchColMenu.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(nytVindue);
        window.show();
    }
}
