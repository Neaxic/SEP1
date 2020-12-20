package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Module.*;

public class CreatingProjectController {

    private Viewhandler viewhandler = new Viewhandler();
    private ArrayList<String> requirements = new ArrayList<>();

    @FXML private TextField ProjectName;
    @FXML private TextArea ProjectDescription;
    @FXML private DatePicker ProjectDeadline;

    @FXML private ChoiceBox ColleagueName;
    @FXML private ChoiceBox ColleagueRole;
    @FXML private ListView ColleagueList;
    @FXML private ListView ColleagueRoleList;

    @FXML private TextField RequirementsTextField;
    @FXML private ListView RequirementsListView;

    public void initialize() throws IOException, ClassNotFoundException {
        for(int i = 0; i < Main.ColleagueList.getKollegaList().size();i++){
            ColleagueName.getItems().add(Main.ColleagueList.getKollegaList().get(i).getNavn());
        }
        ColleagueName.setValue(Main.ColleagueList.getKollegaList().get(0).getNavn());
        ColleagueRole.getItems().add("SCRUM MASTER");
        ColleagueRole.getItems().add("PROJECT OWNER");
        ColleagueRole.getItems().add("PROJECT CREATOR");
        ColleagueRole.getItems().add("TEAM MEMBER");
    }

    public void addColleague(){
        if(ColleagueName.getValue() != null && ColleagueRole.getValue() != null || ColleagueList.getItems().contains(ColleagueName.getValue()) == true){
            //Kollega newKollega = new Kollega(ColleagueName.getValue().toString());
            //newKollega.setRole(ColleagueRole.getValue().toString());
            //newKollega.setBirthday(Main.ColleagueList.getKollegaList().get(ColleagueName.getItems().indexOf(ColleagueName.getValue())).getBirthday());
            ColleagueList.getItems().add(ColleagueName.getValue());
            ColleagueRoleList.getItems().add(ColleagueRole.getValue());
            ColleagueName.getItems().remove(ColleagueName.getValue());
            ColleagueName.setValue(Main.ColleagueList.getKollegaList().get(0).getNavn());
        } else {
            System.out.println("No Colleagues Left!");
        }
    }

    public void projectCreate(ActionEvent event) throws IOException {
        Project newProject = new Project(ProjectName.getText());
        newProject.setDescription(ProjectDescription.getText());
        newProject.setDeadline(ProjectDeadline.getValue().toString());
        newProject.setRequirements(requirements);
            for(int i = 0; i < ColleagueList.getItems().size(); i++){
                newProject.setColleagueNames(ColleagueList.getItems().get(i).toString());
                newProject.setColleagueRoles(ColleagueRoleList.getItems().get(i).toString());
            }
        Main.ProjectsList.addProject(newProject);

        Main.readWrite.saveProject(Main.ProjectsList);

        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void back(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void addRequirement() {
        if(RequirementsTextField.getText() != ""){
            requirements.add(RequirementsTextField.getText());
            RequirementsListView.getItems().add(RequirementsTextField.getText());

            RequirementsTextField.setText("");
        }
    }
}