package game.model;

import java.util.ArrayList;

public class GameEvent {
    protected String eventName;
    protected int doneValue;
    private int remainDays;
    private final GameEventType gameEventType;

    GameEvent(GameEventType gameEventType,int remainDays){
        this.gameEventType = gameEventType;
        this.doneValue = this.gameEventType.getDoneValue();
        this.eventName = this.gameEventType.getType();
        this.remainDays = remainDays;
    }

    public void dayPass(){
        remainDays--;
    }

    public void finishPart(int i){
        doneValue -= i;
    }

    public void setRemainDays(int remainDays){
        this.remainDays = remainDays;
    }

    public int getRemainDays(){return this.remainDays;}

    public String getEventName(){
        return eventName;
    }

    public int getDoneValue(){
        return doneValue;
    }

    public boolean isDone(){
        return doneValue < 0;
    }
}
