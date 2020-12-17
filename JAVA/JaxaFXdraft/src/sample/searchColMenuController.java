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

public class searchColMenuController {

    @FXML private TextField searchInput;
    @FXML private ListView ProjectList;


    public void SearchSubmit(ActionEvent event) throws IOException, ClassNotFoundException {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> allColleagues = new ArrayList<>();

            System.out.println("Search Input:" +searchInput.getText());
            for (int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++) {
                for (int j = 0; j < Main.ProjectsList.getProjectsList().get(i).getKollegaer().size(); j++) {
                    allColleagues.add(Main.ProjectsList.getProjectsList().get(i).getKollegaer().get(j));
                }
            }
        System.out.println(allColleagues);
        if(searchInput.getText() != "") {
            for (int i = 0; i < allColleagues.size(); i++) {
                if(allColleagues.get(i).contains(searchInput.getText())) {
                    result.add(allColleagues.get(i));
                }
            }
            searchInput.setText("");
        }


        ProjectList.getItems().clear();
        System.out.println(result.size());
        for(int i = 0; i < result.size(); i++){
            System.out.println("added 1");
            ProjectList.getItems().add(result.get(i));
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
        //Main.setItemSelected(Main.ProjectsList.getProjectsList().get(ProjectList.getSelectionModel().getSelectedIndex()));
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("ProjectOverview.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }
}




/*
            for (int i = 0; i < Main.ProjectsList.getProjectsList().size(); i++) {
                if(Main.ProjectsList.getProjectsList().get(i).getName().contains(searchInput.getText())) {
                    result.add(Main.ProjectsList.getProjectsList().get(i));
                }
            }
  for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i).getName());
            }

 */