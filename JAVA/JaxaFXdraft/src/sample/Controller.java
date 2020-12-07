package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

/*
    public void loginBut(ActionEvent actionEvent) {
        System.out.println("Logged the fuck in");
    }

    public void cancelBut(ActionEvent actionEvent) throws IOException {
        System.out.println("Canceled - So closed the program");

        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();

    }
*/
    public void loginScrum(ActionEvent actionEvent)  throws IOException{
        System.out.println("Canceled - So closed the program");
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

    public void mainMenuCreateNew(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }

    public void mainMenuProjectHistory(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }

    public void mainMenuSearch(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }

    public void mainMenuSeeAll(ActionEvent actionEvent)   throws IOException{
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
