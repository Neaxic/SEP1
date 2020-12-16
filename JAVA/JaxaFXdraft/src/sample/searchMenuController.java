package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class searchMenuController {

    @FXML
    private TextField searchInput;
    @FXML private ListView ProjectList;


    public void SearchSubmit(ActionEvent event) throws IOException, ClassNotFoundException {
        ArrayList<Project> result = new ArrayList<>();
        if(searchInput.getText() != "") {
            System.out.println("Search Input:" +searchInput.getText());
            for (int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++) {
                if(Main.ProjectsList.getProjectsList().get(i).getName().contains(searchInput.getText())) {
                    result.add(Main.ProjectsList.getProjectsList().get(i));
                }
            }

            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i).getName());
            }

            //System.out.println(Main.ProjectsList.getProjectsList().get(4).getName());
            searchInput.setText("");
        }
        ProjectList.getItems().clear();
        for(int i = 0; i < result.size(); i++){
            ProjectList.getItems().add(result.get(i).getName());
        };
    }


    public void back(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    public void seeMore(ActionEvent event) throws IOException {
        System.out.println(Main.getItemSelected().getName());
        Main.setItemSelected(Main.ProjectsList.getProjectsList().get(ProjectList.getSelectionModel().getSelectedIndex()));
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("ProjectOverview.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }
}
