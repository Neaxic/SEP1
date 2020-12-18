package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import java.io.IOException;
import Module.*;
import org.w3c.dom.Text;

public class ProjectOverviewController {

    private Viewhandler viewhandler = new Viewhandler();

    @FXML private Label ProjectName;
    @FXML private Label ProjectDeadline;
    @FXML private Text ProjectDescription;

    @FXML private ListView CollList;
    @FXML private ListView RoleList;
    @FXML private ListView ReqList;

    public void back(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void editProjectScene(ActionEvent event) throws IOException {
        viewhandler.setSceneSelect("EditScreen");
        viewhandler.SwitchScenes(event);
    }

    public void initialize() throws IOException, ClassNotFoundException {
        ProjectName.setText(Main.getItemSelected().getName());
        ProjectDeadline.setText(Main.getItemSelected().getDeadline());
        //ProjectDescription.setData(Main.getItemSelected().getDescription());

            for (int j = 0; j < Main.getItemSelected().getKollegaer().size(); j++) {
                CollList.getItems().add(Main.getItemSelected().getKollegaer().get(j));
            }

        for (int i = 0; i < Main.getItemSelected().getKollegaerRoller().size(); i++) {
            ReqList.getItems().add(Main.getItemSelected().getKollegaerRoller().get(i));
        }

        for (int i = 0; i < Main.getItemSelected().getRequirements().size(); i++) {
            RoleList.getItems().add(Main.getItemSelected().getRequirements().get(i));
        }

    }
}


