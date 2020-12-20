package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.Chart;
import javafx.scene.chart.PieChart;
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

    @FXML private PieChart PieChart;

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

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Finished", 55),
                        new PieChart.Data("Rejected",4),
                        new PieChart.Data("In Progress", 30),
                        new PieChart.Data("Pending", 30));
        PieChart.setData(pieChartData);
        PieChart.animatedProperty();


        //ProjectDescription.setData(Main.getItemSelected().getDescription());

            for (int j = 0; j < Main.getItemSelected().getColleagueNames().size(); j++) {
                CollList.getItems().add(Main.getItemSelected().getColleagueNames().get(j));
                RoleList.getItems().add(Main.getItemSelected().getColleagueRoles().get(j));
            }

            for (int i = 0; i < Main.getItemSelected().getRequirements().size(); i++) {
                ReqList.getItems().add(Main.getItemSelected().getRequirements().get(i));
            }

    }
}


