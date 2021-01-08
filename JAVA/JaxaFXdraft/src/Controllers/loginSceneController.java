package Controllers;

import javafx.event.ActionEvent;
import java.io.IOException;
import Module.Viewhandler;

public class loginSceneController {

    Viewhandler viewhandler = new Viewhandler();

    public void loginScrum(ActionEvent event)  throws IOException {
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void loginOwner(ActionEvent event)   throws IOException{
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void loginCreator(ActionEvent event)   throws IOException{
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }

    public void loginMember(ActionEvent event)   throws IOException{
        viewhandler.setSceneSelect("mainMenu");
        viewhandler.SwitchScenes(event);
    }
}
