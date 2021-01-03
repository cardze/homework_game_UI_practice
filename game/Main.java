package game;

import game.testing_file.ComputerCamp;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader =new FXMLLoader(getClass().getResource("menu.fxml"));
        Parent root =loader.load();

        ComputerCamp cp=new ComputerCamp();
        MenuController mc=loader.getController();
        mc.setCP(cp);

        stage.setTitle("MENU");
        Scene scene = new Scene(root,900,600);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
