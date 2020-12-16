package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

import javafx.scene.control.Label;

public class ProjectOverviewController {

    @FXML private Label ProjectName;
    @FXML private Label ProjectDeadline;
    @FXML private Label ProjectDescription;

    public void back(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    public void initialize(){
        ProjectName.setText(Main.getItemSelected().getName());
        ProjectDeadline.setText(Main.getItemSelected().getDeadline());
        ProjectDescription.setText(Main.getItemSelected().getDescription());
    }
}


