package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class projectHistoryController {
    public void back(ActionEvent event) throws IOException {
        Parent andetWindowParent = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        Scene andetWindow = new Scene(andetWindowParent);

        //Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(andetWindow);
        window.show();
    }

    public void delete(ActionEvent actionEvent) {
    }

    public void viewMore(ActionEvent actionEvent) {
    }
}
