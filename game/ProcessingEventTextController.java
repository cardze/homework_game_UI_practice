package game;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class ProcessingEventTextController {
    @FXML
    TextFlow showing_msg_flow;
    @FXML
    Button continue_btn;
    @FXML
    public void setShowing_msg_flow(Text msg){
        showing_msg_flow=new TextFlow(msg);
    }
}
