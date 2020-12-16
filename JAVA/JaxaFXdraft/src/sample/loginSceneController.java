package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class selectRoleController {

    public void loginScrum(ActionEvent actionEvent)  throws IOException {
        setSceneToMainMenu(actionEvent);
    }

    public void loginOwner(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }

    public void loginCreator(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }

    public void loginMember(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }

    public void setSceneToMainMenu(ActionEvent event) throws IOException {

        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }
}
