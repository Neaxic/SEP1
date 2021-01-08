package Controllers;

import Module.Main;
import Module.Project;
import Module.Viewhandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import Module.*;


public class CreatingColleagueController {

    private Viewhandler viewhandler = new Viewhandler();

    @FXML private TextField colleagueName;
    @FXML private DatePicker colleagueBirthday;
    @FXML private ListView colleagueList;
    @FXML private ListView colleagueBirthdayList;

    public void back(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void initialize(){
        for(int i = 0; i < Main.ColleagueList.getKollegaList().size();i++){
            colleagueList.getItems().add(Main.ColleagueList.getKollegaList().get(i).getNavn());
            colleagueBirthdayList.getItems().add(Main.ColleagueList.getKollegaList().get(i).getBirthday());
        }
    }

    public void delete(ActionEvent event) throws IOException {
        Main.ColleagueList.getKollegaList().remove(Main.ColleagueList.getKollegaList().get(colleagueList.getSelectionModel().getSelectedIndex()));
        Main.readWriteColleague.saveKollega(Main.ColleagueList);
        viewhandler.setSceneSelect("CreatingColleague");
        viewhandler.SwitchScenes(event);
    }

    public void createColleague(ActionEvent event) throws IOException {
        Kollega newKollega = new Kollega(colleagueName.getText());
        newKollega.setBirthday(colleagueBirthday.getValue().toString());
        Main.ColleagueList.addKollega(newKollega);

        Main.readWriteColleague.saveKollega(Main.ColleagueList);

        viewhandler.setSceneSelect("CreatingColleague");
        viewhandler.SwitchScenes(event);
    }
}