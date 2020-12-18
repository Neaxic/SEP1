package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import Module.Viewhandler;

public class mainMenuController {

    Viewhandler viewhandler = new Viewhandler();

    public void mainMenuCreateNew(ActionEvent event)   throws IOException {
        viewhandler.setSceneSelect("CreatingProject");
        viewhandler.SwitchScenes(event);
    }

    public void mainMenuProjectHistory(ActionEvent event) throws IOException, ClassNotFoundException {
        viewhandler.setSceneSelect("ProjectHistory");
        viewhandler.SwitchScenes(event);
    }

    public void mainMenuSearch(ActionEvent event)   throws IOException{
        viewhandler.setSceneSelect("searchMenu");
        viewhandler.SwitchScenes(event);
    }

    public void mainMenuSearchCol(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("searchColMenu");
        viewhandler.SwitchScenes(event);
    }
}
