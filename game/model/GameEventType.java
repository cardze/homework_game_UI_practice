package game.model;

public enum GameEventType {
    CAMP("電腦營",50),
    HALLOWEEN("萬聖節",60),
    BBQ("系烤",70),
    ASSOCIATIONMEETING("系週會",80);

    private final String type;
    private final int doneValue;
    GameEventType(String type,int doneValue){
        this.type = type;
        this.doneValue = doneValue;
    }

    public String getType(){
        return type;
    }

    public int getDoneValue(){
        return doneValue;
    }
}
