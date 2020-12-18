package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import Module.Project;
import Module.Projects;
import Module.Main;
import Module.Viewhandler;

public class EditScreenController {

    private Viewhandler viewhandler = new Viewhandler();
    private ArrayList<String> namesTemp = new ArrayList<>();
    private ArrayList<String> rolesTemp = new ArrayList<>();
    private ArrayList<String> requirements = new ArrayList<>();

    public void mainMenuSeeAll(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    @FXML private TextField ProjectName;
    @FXML private TextArea ProjectDescription;
    @FXML private DatePicker ProjectDeadline;

    @FXML private TextField ColleaguesNameInput;
    @FXML private TextField ColleaguesRoleInput;
    @FXML private ListView ColleaguesName;
    @FXML private ListView ColleaguesRole;

    public void initialize(){
        ProjectName.setText(Main.getItemSelected().getName());
        ProjectDeadline.setPromptText(Main.getItemSelected().getDeadline());
        ProjectDescription.setText(Main.getItemSelected().getDescription());
    }

    public void EditProject(ActionEvent event) throws IOException {
        Project newProject = Main.getItemSelected().copy(Main.getItemSelected(), Main.getItemSelected().getName());
        if (ProjectName.getText() != "") {
            newProject.setName(ProjectName.getText());
        } else {
            newProject.setName(Main.getItemSelected().getName());
        }

        if (ProjectDescription.getText() != "") {
            newProject.setDescription(ProjectDescription.getText());
        } else {
            newProject.setDescription(Main.getItemSelected().getDescription());
        }
        if (ProjectDeadline.getValue().toString() != Main.getItemSelected().getDeadline()) {
            newProject.setDeadline(ProjectDeadline.getValue().toString());
        } else {
            newProject.setDeadline(Main.getItemSelected().getDeadline());
        }

        if (namesTemp != Main.getItemSelected().getKollegaer() && rolesTemp.size() != 0) {
            newProject.setKollegaerListe(namesTemp);
        } else {
            newProject.setKollegaerListe(Main.getItemSelected().getKollegaer());
        }

        if (rolesTemp != Main.getItemSelected().getKollegaerRoller() && rolesTemp.size() != 0) {
            newProject.setKollegaerRoller(rolesTemp);
        } else {
            newProject.setKollegaerRoller(Main.getItemSelected().getKollegaerRoller());
        }

        if (requirements != Main.getItemSelected().getRequirements() && rolesTemp.size() != 0) {
            newProject.setRequirements(requirements);
        } else {
            newProject.setRequirements(Main.getItemSelected().getRequirements());
        }

        Main.ProjectsList.addProject(newProject);

        Main.readWrite.SaveProject(Main.ProjectsList);

        viewhandler.setSceneSelect("ProjectHistory");
        viewhandler.SwitchScenes(event);
    }


    public void addColleague(ActionEvent actionEvent) {
        if ((ColleaguesNameInput.getText() != "") && (ColleaguesRoleInput.getText() != "")) {
            namesTemp.add(ColleaguesNameInput.getText());
            rolesTemp.add(ColleaguesRoleInput.getText());
            ColleaguesName.getItems().add(ColleaguesNameInput.getText());
            ColleaguesRole.getItems().add(ColleaguesRoleInput.getText());


            ColleaguesRoleInput.setText("");
            ColleaguesNameInput.setText("");
        }

    }

    @FXML private TextField RequirementsTextField;
    @FXML private ListView RequirementsListView;
    public void addRequirement(ActionEvent actionEvent) {
        requirements.add(RequirementsTextField.getText());
        RequirementsListView.getItems().add(RequirementsTextField.getText());

        RequirementsTextField.setText("");
    }
}