package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class MenuController implements Initializable {
//    private ComputerCamp cp;

    @FXML
    private Button startBtn;
    @FXML
    public void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        Parent root;
        FXMLLoader loader=new FXMLLoader(getClass().getResource("schedule_form.fxml"));
        root = loader.load();
        ScheduleFormController sfc=loader.getController();
        //開始設定畫面
//        sfc.setThe_quest(cp.getEventName());
        sfc.setNum_of_week(new Integer(1));
//        sfc.setThe_quest_remaining(cp.getDoneValue());

        stage = (Stage) startBtn.getScene().getWindow();

        Scene scene = new Scene(root,900,600);
        stage.setScene(scene);
        stage.show();
    }
//    public void setCP(ComputerCamp cp){
//        this.cp=cp;
//    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
