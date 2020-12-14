package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    Projects ProjectsList = new Projects();
    ReadWrite readWrite = new ReadWrite();

    public void loginScrum(ActionEvent actionEvent)  throws IOException{
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

    public void mainMenuProjectHistory(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        setSceneProjectHistory(actionEvent);
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

    /* CREATE PROJECT ------------------------------------------------ */

    @FXML private TextField ProjectName;
    @FXML private TextArea ProjectDescription;
    @FXML private DatePicker ProjectDeadline;

    public void projectCreate(ActionEvent actionEvent) throws IOException, ClassNotFoundException {
        Project newProject = new Project(ProjectName.getText());
        newProject.setDescription(ProjectDescription.getText());
        newProject.setDeadline(ProjectDeadline.getValue().toString());
        ProjectsList.addProject(newProject);

        System.out.println("New Project Title: " +newProject.getName());
        System.out.println("New Project Deadline: " +newProject.getDeadline());
        System.out.println("New Project Description: " +newProject.getDescription());
        System.out.println(ProjectsList.getProjectsList());
        readWrite.SaveProject(ProjectsList);
        setSceneProjectHistory(actionEvent);
    }

    public void setSceneCreateProject(ActionEvent event) throws IOException {
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("CreatingProject.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(nytVindue);
        window.show();
    }

    /* LIST PROJECTS ------------------------------------------------ */

    @FXML private Label ProjectLabel;
    @FXML private ListView ProjectList;

    public void setSceneProjectHistory(ActionEvent event) throws IOException, ClassNotFoundException {
        Scene nytVindue = new Scene(FXMLLoader.load(getClass().getResource("ProjectHistory.fxml")));
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        System.out.println(readWrite.readProjects().getProjectsList().get(0).getName());
        window.setScene(nytVindue);
        window.show();
        ProjectLabel.setText("Test");
        //ProjectLabel.setText(readFromFile.readProjects().getProjectsList().get(0).getName());

    }

    // INITIALIZE ALLE LABLES PÅ FORHÅND
    public void initialize(){
        //ProjectLabel.setText("Test");
        //ProjectLabel.setText(readFromFile.readProjects().getProjectsList().get(0).getName());
        //ProjectList.add(readFromFile.readProjects().getProjectsList().get(0).getName());
    }
}
