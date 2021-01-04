package game.model;

import game.Main;

import java.util.ArrayList;

public class Gamerule {
    private final ArrayList<Role> charactersArrayList = new ArrayList<>();
    private final ArrayList<GameEvent> gameEventArrayList = new ArrayList<>();
    private int sacsd;
    private int currentDay;
    private int currentEvent = 0;

    public Gamerule(){
        sacsd = 100;
        currentDay = 1;
        int temp = 0;
        for(GameEventType gameEventType:GameEventType.values()){
            int[] remainTime = {20, 40, 60, 80};
            GameEvent tempEvent = new GameEvent(gameEventType, remainTime[temp]);
            gameEventArrayList.add(tempEvent);
            temp++;
        }
        charactersArrayList.add(new Director());
        charactersArrayList.add(new ViceDirector());
        charactersArrayList.add(new ActivitiesDirector());
    }

    public void doCycle(){
        currentDay++;
        for (GameEvent gameEvent: gameEventArrayList) {
            gameEvent.dayPass();
        }
        for(Role role: charactersArrayList){
            setDayState(role, gameEventArrayList.get(currentEvent), currentDay%5);
        }

        if(gameEventArrayList.get(currentEvent).doneValue == 0) {
            Main.gameState = GameState.WIN;
        }
        else if(charactersArrayList.size()==0 || gameEventArrayList.get(currentEvent).getRemainDays() <= 0) {
            Main.gameState = GameState.LOSE;
        }
        else {
            Main.gameState = GameState.CONTINUE;
        }

    }



    public void setDayState(Role ch, GameEvent cp, int day) {
        TaskState t = ch.getTaskState(day);
        if(ch.checkMotion()){
            switch (t) {
                case WORK:
                case SPECIALWORK:
//                    setSpecialMove(ch,day);
                    cp.finishPart(ch.getWorkAbility());
                    ch.getHurt(ch.getWorkAbility()*5);
                    break;
                case NONE:
                    ch.getHurt(ch.breakMotionValue());
                default:
                    break;
            }

        }
        else{
            System.out.println(charactersArrayList);
            charactersArrayList.remove(ch);
            System.out.println(charactersArrayList);
        }
    }

    public String getCurrentEventName(){
        return gameEventArrayList.get(currentEvent).getEventName();
    }
}
