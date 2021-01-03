package game.testing_file;

import java.util.ArrayList;

public abstract class Event {
    protected String eventName;
    protected int doneValue;
    protected int remainDays;
    ArrayList<Character> list = new ArrayList<Character>(); 

    public void dayPass(){
        remainDays--;
    }

    public void finishpart(int i){
        doneValue -= i;
    }

    public void setRemainDays(int remainDays){
        this.remainDays = remainDays;
    }

    public void removeCharacter(Character ys) {
        list.remove(ys);
    }

    public ArrayList getList() {
        return list;
    }

    public Character getListIndex(int i) {
        return list.get(i);
    }

    public String getEventName(){
        return eventName;
    }
    public int getDoneValue(){
        return doneValue;
    }
    public boolean beenDone(){
        if(doneValue < 0)
            return true;
         return false;
    }
}
