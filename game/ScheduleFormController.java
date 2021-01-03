package game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.event.ActionEvent;

import javafx.fxml.Initializable;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ScheduleFormController implements Initializable {
    @FXML
    private Label the_quest, num_of_week, quest_time_remaining, the_quest_remaining, C_HP_remaining, P_HP_remaining;
    @FXML
    private ProgressBar C_HP_BAR, P_HP_BAR;
    @FXML
    private Button continue_btn;
    @FXML
    public void continueChoosingEvent(ActionEvent e) throws Exception{
        //TO DO
        //放按下按鈕後需要做的事
    }
    @FXML
    public void setThe_quest(String quest_name){
        String full_text="本次任務 : "+quest_name;
        this.the_quest.setText(full_text);
    }
    @FXML
    public void setNum_of_week(Integer num_of_week){
        String full_text="第"+num_of_week.toString()+"周";
        this.num_of_week.setText(full_text);
    }
    @FXML
    public void setQuest_time_remaining(Integer remaining_days){
        String full_text="剩餘 "+remaining_days+" 天";
        this.quest_time_remaining.setText(full_text);
    }
    @FXML
    public void setThe_quest_remaining(Integer quailty){
        String full_text="剩餘 : "+quailty.toString();
        this.the_quest_remaining.setText(full_text);
    }
    @FXML
    public void setC_HP(Integer remaining_HP){
        String full_text=remaining_HP.toString()+"/100";
        Double bar_progress= Double.valueOf(remaining_HP/100);
        this.C_HP_remaining.setText(full_text);
        this.C_HP_BAR.setProgress(bar_progress);
    }
    @FXML
    public void setP_HP(Integer remaining_HP){
        String full_text=remaining_HP.toString()+"/100";
        Double bar_progress= Double.valueOf(remaining_HP/100);
        this.P_HP_remaining.setText(full_text);
        this.P_HP_BAR.setProgress(bar_progress);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
