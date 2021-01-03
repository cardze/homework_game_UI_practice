package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TheEndOfGameController {
    @FXML
    private Button close_btn;
    Stage stage;
    @FXML
    public void handleOncloseWindow(ActionEvent e) throws Exception{
        stage= (Stage) close_btn.getScene().getWindow();
        stage.close();
    }
}
