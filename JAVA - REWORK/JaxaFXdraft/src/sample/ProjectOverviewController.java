package sample;

import com.sun.source.tree.Tree;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.awt.*;
import java.io.IOException;

public class ProjectOverviewController {

    @FXML private Label ProjectName;
    @FXML private Label ProjectDeadline;
    @FXML private Label ProjectDescription;

    @FXML private ListView CollList;
    @FXML private ListView RoleList;
    @FXML private ListView ReqList;

    public void back(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    public void editProjectScene(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("EditScreen.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    public void initialize() throws IOException, ClassNotFoundException {
        System.out.println(Main.getItemSelected().getName());
        ProjectName.setText(Main.getItemSelected().getName());
        ProjectDeadline.setText(Main.getItemSelected().getDeadline());
        ProjectDescription.setText(Main.getItemSelected().getDescription());

            for (int j = 0; j < Main.getItemSelected().getKollegaer().size(); j++) {
                CollList.getItems().add(Main.getItemSelected().getKollegaer().get(j));
                //System.out.println(Main.getItemSelected().getRequirements().size());
            }

            //RoleList.getItems().add(Main.readWrite.readProjects().getProjectsList().get(i));

        for (int i = 0; i < Main.getItemSelected().getKollegaerRoller().size(); i++) {
            ReqList.getItems().add(Main.getItemSelected().getKollegaerRoller().get(i));
        }

        for (int i = 0; i < Main.getItemSelected().getRequirements().size(); i++) {
            RoleList.getItems().add(Main.getItemSelected().getRequirements().get(i));
        }

        /*for(int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++){
            for (int j = 0; j < Main.readWrite.readProjects().getProjectsList().get(i).getRequirements().size(); j++) {
                ReqList.getItems().add(Main.readWrite.readProjects().getProjectsList().get(i).getRequirements().get(j));
            }

        };*/
    }
}


