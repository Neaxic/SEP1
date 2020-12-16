package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class projectHistoryController {

    @FXML private Label ProjectLabel;
    @FXML private ListView ProjectList;


    public void back(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    public void initialize() throws IOException, ClassNotFoundException {
        ProjectLabel.setText(String.valueOf(Main.ProjectsList.getProjectsList().size()));
        for(int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++){
            ProjectList.getItems().add(Main.readWrite.readProjects().getProjectsList().get(i).getName());
        };
    }

    public void delete(ActionEvent actionEvent) {
    }

    public void viewMore(ActionEvent actionEvent) {
    }
}