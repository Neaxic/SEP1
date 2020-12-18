package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class projectHistoryController {

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
        for(int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++){
            ProjectList.getItems().add(Main.readWrite.readProjects().getProjectsList().get(i).getName());
        };
    }

    public void delete() throws IOException {
        Main.ProjectsList.getProjectsList().remove(Main.ProjectsList.getProjectsList().get(ProjectList.getSelectionModel().getSelectedIndex()));
        Main.readWrite.SaveProject(Main.ProjectsList);
    }

    public void viewMore(ActionEvent event) throws IOException {
        Main.setItemSelected(Main.ProjectsList.getProjectsList().get(ProjectList.getSelectionModel().getSelectedIndex()));
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("ProjectOverview.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

}
