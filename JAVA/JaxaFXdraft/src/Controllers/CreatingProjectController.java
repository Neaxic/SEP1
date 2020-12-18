package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

import Module.*;

public class CreatingProjectController {

    private Viewhandler viewhandler = new Viewhandler();

    private ArrayList<String> namesTemp = new ArrayList<>();
    private ArrayList<String> rolesTemp = new ArrayList<>();
    private ArrayList<String> requirements = new ArrayList<>();

    public void back(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    @FXML private TextField ProjectName;
    @FXML private TextArea ProjectDescription;
    @FXML private DatePicker ProjectDeadline;

    @FXML private TextField ColleaguesNameInput;
    @FXML private TextField ColleaguesRoleInput;
    @FXML private ListView ColleaguesName;
    @FXML private ListView ColleaguesRole;


    public void projectCreate(ActionEvent event) throws IOException {
        Project newProject = new Project(ProjectName.getText());
        newProject.setDescription(ProjectDescription.getText());
        newProject.setDeadline(ProjectDeadline.getValue().toString());
        newProject.setKollegaerListe(namesTemp);
        newProject.setKollegaerRoller(rolesTemp);
        newProject.setRequirements(requirements);
        Main.ProjectsList.addProject(newProject);

        Main.readWrite.saveProject(Main.ProjectsList);

        viewhandler.setSceneSelect("mainMenu");
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

    public void addRequirement() {
        if(RequirementsTextField.getText() != ""){
            requirements.add(RequirementsTextField.getText());
            RequirementsListView.getItems().add(RequirementsTextField.getText());

            RequirementsTextField.setText("");
        }
    }
}