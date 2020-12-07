package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
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
        setSceneCreateProject(actionEvent);
    }

    public void mainMenuProjectHistory(ActionEvent actionEvent)   throws IOException{
        setSceneProjectHistory(actionEvent);
    }

    public void mainMenuSearch(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }

    public void mainMenuSeeAll(ActionEvent actionEvent)   throws IOException{
        setSceneToMainMenu(actionEvent);
    }
    
    /* CREATE PROJECT */

    public void ss(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(FXMLLoader.load(getClass().getResource("CreatingProject.fxml")));
        window.show();
    }

    public void setSceneToMainMenu(ActionEvent event) throws IOException {

        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    @FXML private TextField ProjectName;
    @FXML private Button ProjectBtn;
    @FXML private Label ProjectLabel;

    public void setSceneCreateProject(ActionEvent event) throws IOException {
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("CreatingProject.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(nytVindue);
        window.show();
    }

    public void setSceneProjectHistory(ActionEvent event) throws IOException {
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("ProjectHistory.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(nytVindue);
        window.show();
    }
}
