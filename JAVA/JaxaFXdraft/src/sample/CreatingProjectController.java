package sample;

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

public class CreatingProjectController {

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


    public void projectCreate(ActionEvent event) throws IOException {
        Project newProject = new Project(ProjectName.getText());
        newProject.setDescription(ProjectDescription.getText());
        newProject.setDeadline(ProjectDeadline.getValue().toString());
        newProject.setKollegaerListe(namesTemp);
        newProject.setKollegaerRoller(rolesTemp);
        newProject.setRequirements(requirements);
        Main.ProjectsList.addProject(newProject);

        Main.readWrite.SaveProject(Main.ProjectsList);

        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("ProjectHistory.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
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