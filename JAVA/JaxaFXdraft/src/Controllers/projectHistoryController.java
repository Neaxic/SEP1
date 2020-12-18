package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

import Module.*;

public class projectHistoryController {

    @FXML private ListView ProjectList;
    private Viewhandler viewhandler = new Viewhandler();

    public void back(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
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
        viewhandler.setSceneSelect("ProjectOverview");
        viewhandler.SwitchScenes(event);
    }

}
