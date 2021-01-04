package game;

import game.model.GameState;
import game.model.Gamerule;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TheEndOfGameController implements Initializable {
    @FXML
    private Button close_btn;
    @FXML
    private Label result_label;

    private static final String winning_MSG="YOU WIN";
    private static final String losing_MSG="YOU FAILED";

    Stage stage;

    @FXML
    public void handleOncloseWindow(ActionEvent e) throws Exception{
        stage= (Stage) close_btn.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Main.gameState == GameState.WIN)
            this.result_label.setText(winning_MSG);
        else if (Main.gameState == GameState.LOSE)
            this.result_label.setText(losing_MSG);
        else {
            this.result_label.setText("ERROR");
            System.out.println("PANIC:WRONG RESULT");
        }
    }
}
