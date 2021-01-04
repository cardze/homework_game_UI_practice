package game;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import game.model.Gamerule;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ScheduleFormController implements Initializable {
    public static final String MAIN_DIRACTOR="game/material/mainDiractorImg.png", VICE_DIRACTOR= "game/material/ViceDiractorImg.png", STORAGE_MANAGER="game/material/storageManagerImg.png", EVENT_MANAGER="game/material/EventManagerImg.png", LITERATURE_BOSS="game/material/LiteratureBossImg.png";
    @FXML
    private Label the_quest, num_of_week, quest_time_remaining, the_quest_remaining, C_HP_remaining, P_HP_remaining;
    @FXML
    private ProgressBar C_HP_BAR, P_HP_BAR;
    @FXML
    private Button continue_btn;

    @FXML
    private ImageView main_director_sign, vice_director_sign, event_manager_sign, literature_boss_sign, storage_manager_sign;
    @FXML
    private ImageView showing_choosed_role_img;

    private Gamerule gamerule;

    @FXML
    public void continueChoosingEvent(ActionEvent e) throws Exception{
        //TO DO
        //放按下按鈕後需要做的事
        gamerule.doCycle();
        switch (Main.gameState){
            case WIN:
                //Win
                break;
            case LOSE:
                //Lose
                break;
            default:
                break;
        }
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
        this.gamerule = new Gamerule();
        setThe_quest(this.gamerule.getCurrentEventName());
    }
    public void setAllSignInvisiable(){
        this.main_director_sign.setVisible(false);
        this.vice_director_sign.setVisible(false);
        this.event_manager_sign.setVisible(false);
        this.literature_boss_sign.setVisible(false);
        this.storage_manager_sign.setVisible(false);
    }
    public void main_director_img_onClick(MouseEvent e) {
        setAllSignInvisiable();
        this.main_director_sign.setVisible(true);
        this.showing_choosed_role_img.setImage(new Image(MAIN_DIRACTOR));
    }

    public void vice_director_img_onClick(MouseEvent e) {
        setAllSignInvisiable();
        this.vice_director_sign.setVisible(true);
        this.showing_choosed_role_img.setImage(new Image(VICE_DIRACTOR));
    }

    public void event_manager_img_onClick(MouseEvent e) {
        setAllSignInvisiable();
        this.event_manager_sign.setVisible(true);
        this.showing_choosed_role_img.setImage(new Image(EVENT_MANAGER));

    }

    public void literature_boss_img_onClick(MouseEvent e) {
        setAllSignInvisiable();
        this.literature_boss_sign.setVisible(true);
        this.showing_choosed_role_img.setImage(new Image(LITERATURE_BOSS));

    }

    public void storage_manager_img_onClick(MouseEvent e) {
        setAllSignInvisiable();
        this.storage_manager_sign.setVisible(true);
        this.showing_choosed_role_img.setImage(new Image(STORAGE_MANAGER));

    }
}
