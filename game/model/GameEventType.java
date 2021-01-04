package game.model;

public enum GameEventType {
    CAMP("Camp",50),
    HALLOWEEN("Halloween",60),
    BBQ("BBQ",70),
    ASSOCIATIONMEETING("Association Meeting",80);

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
