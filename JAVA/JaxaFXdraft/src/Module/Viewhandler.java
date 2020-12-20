package Module;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Viewhandler {

    public static String SceneSelect;

    public Viewhandler(){
        this.SceneSelect = "0";
    }

    public static void setSceneSelect(String sceneSelect) {
        SceneSelect = sceneSelect;
    }

    public void SwitchScenes(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("../Scenes/" +SceneSelect +".fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }
}
