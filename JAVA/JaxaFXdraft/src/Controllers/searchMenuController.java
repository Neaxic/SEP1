package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.util.ArrayList;

import Module.*;

public class searchMenuController {

    @FXML
    private TextField searchInput;
    @FXML private ListView ProjectList;

    private Viewhandler viewhandler = new Viewhandler();

    public void SearchSubmit(ActionEvent event) throws IOException, ClassNotFoundException {
        ArrayList<Project> result = new ArrayList<>();
        if(searchInput.getText() != "") {
            System.out.println("Search Input:" +searchInput.getText());
            for (int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++) {
                if(Main.ProjectsList.getProjectsList().get(i).getName().contains(searchInput.getText())) {
                    result.add(Main.ProjectsList.getProjectsList().get(i));
                }
            }

            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i).getName());
            }

            //System.out.println(Main.ProjectsList.getProjectsList().get(4).getName());
            searchInput.setText("");
        }
        ProjectList.getItems().clear();
        for(int i = 0; i < result.size(); i++){
            ProjectList.getItems().add(result.get(i).getName());
        };
    }


    public void back(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void seeMore(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("ProjectOverview");
        viewhandler.SwitchScenes(event);
    }
}
