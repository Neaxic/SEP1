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
import java.util.ArrayList;
import java.util.Collections;

import Module.*;

public class mainMenuController {
    @FXML private ListView ProjectList;
    @FXML private ListView colleagueList;
    private Viewhandler viewhandler = new Viewhandler();
    private Project ProjectClass = new Project("test");
    private Project ColleagueClass = new Project("test");

    public void mainMenuCreateNew(ActionEvent event)   throws IOException {
        viewhandler.setSceneSelect("CreatingProject");
        viewhandler.SwitchScenes(event);
    }

    public void CreateColleague(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("CreatingColleague");
        viewhandler.SwitchScenes(event);
    }

    public void initialize() throws IOException, ClassNotFoundException {
        for(int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++){
            ProjectList.getItems().add(Main.readWrite.readProjects().getProjectsList().get(i).getName());
        };
        for(int i = 0; i < Main.ColleagueList.getKollegaList().size();i++){
            colleagueList.getItems().add(Main.readWriteColleague.readKollega().getKollegaList().get(i).getNavn());
        }
    }

    public void delete(ActionEvent event)
        throws IOException, ClassNotFoundException
    {
       /* if(ProjectList.getSelectionModel().getSelectedItem().getClass() == Main.readWrite.readProjects().getProjectsList().get(0).getClass()){ */
            Main.ProjectsList.getProjectsList().remove(Main.ProjectsList.getProjectsList().get(ProjectList.getSelectionModel().getSelectedIndex()));
            Main.readWrite.saveProject(Main.ProjectsList);
            viewhandler.setSceneSelect("mainMenu");
            viewhandler.SwitchScenes(event);
        /* } else if(colleagueList.getSelectionModel().getSelectedItem().getClass() == Main.readWriteColleague.readKollega().getKollegaList().get(0).getClass()){
            Main.ColleagueList.getKollegaList().remove(Main.ColleagueList.getKollegaList().get(colleagueList.getSelectionModel().getSelectedIndex()));
            Main.readWriteColleague.saveKollega(Main.ColleagueList);
            viewhandler.setSceneSelect("mainMenu");
            viewhandler.SwitchScenes(event);
        }*/
    }
    public void viewMore(ActionEvent event) throws IOException {
        Main.setItemSelected(Main.ProjectsList.getProjectsList().get(ProjectList.getSelectionModel().getSelectedIndex()));
        viewhandler.setSceneSelect("ProjectOverview");
        viewhandler.SwitchScenes(event);
    }

    public void SearchProject(ActionEvent event)   throws IOException{
        viewhandler.setSceneSelect("searchMenu");
        viewhandler.SwitchScenes(event);
    }

}
