package Module;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import parser.XmlJsonParser;

import java.io.File;

public class Main extends Application {

    public static ReadWrite readWrite = new ReadWrite();
    public static ReadWriteColleague readWriteColleague = new ReadWriteColleague();
    public static Projects ProjectsList = new Projects();
    public static KollegaList ColleagueList = new KollegaList();
    private static Project ItemSelected;

    public static Project getItemSelected() {
        return ItemSelected;
    }

    public static void setItemSelected(Project itemSelected) {
        ItemSelected = itemSelected;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("../Scenes/loginScene.fxml"));
        primaryStage.setTitle("Colour ITs management system");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
        primaryStage.setResizable(false);

        if(readWrite.readProjects().getProjectsList().size() > 0){
            for(int i = 0; i < readWrite.readProjects().getProjectsList().size(); i++){
                ProjectsList.addProject(readWrite.readProjects().getProjectsList().get(i));
            }
        }
        if(readWriteColleague.readKollega().getKollegaList().size() > 0){
            for(int i = 0; i < readWriteColleague.readKollega().getKollegaList().size(); i++){
                ColleagueList.addKollega(readWriteColleague.readKollega().getKollegaList().get(i));
            }
        }

        // PARSER (kører på startup - dårligt design)
        XmlJsonParser parser = new XmlJsonParser();
        File file = parser.toXml(ProjectsList, "dataProjects.xml");
        System.out.println("Generated file: " +file.getAbsolutePath());

    }


    public static void main(String[] args) {
        launch(args);
    }
}