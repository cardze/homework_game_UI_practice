package game;

import game.model.GameState;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static GameState gameState = GameState.CONTINUE;
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader =new FXMLLoader(getClass().getResource("menu.fxml"));
        Parent root =loader.load();


        MenuController mc = loader.getController();


        stage.setTitle("MENU");
        Scene scene = new Scene(root,900,600);

        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}