package game.testing_file;

import java.util.ArrayList;

public class CountDay {
    public void setYSWeekSkill(YS ys) {
        int days = (int)(Math.random()*2)+1;
        int i =0;
        for(int k=0; k<ys.calender.length;k++) {
            if(ys.getTaskState(k) == TaskState.work) {
                i++;
            }
        }
        int[] week = new int[ys.calender.length];
        while(i != 0 && days != 0){
            int temp = (int)(Math.random()*5);
            if(week[temp] == 0 && ys.getTaskState(temp) == TaskState.work) {
                ys.setTaskState(temp,TaskState.specialwork);
                week[temp]++;
                i--;
                days--;
            }
        }
        
    }

    public void setYSspecialMove(Character ch,int i){
        if(ch.calender[i]==TaskState.specialwork){
            ch.setworkAbility(2);
        }
        else {
            ch.setworkAbility(1);
            //turn the workAbility original back
        }
    }
    
    public void runDay(ArrayList list, ComputerCamp cp) {
        for (int i =0;i < 5; i++) {
            for (int j =0;j < list.size(); j++) {
                setYSDayState((Character)list.get(j),cp,i);
                cp.dayPass();
            }
        }
        if(CheckGaneState(list,cp) != GameState.conti) {
            //進入結束畫面
            System.out.println("End"+CheckGaneState(list,cp));
        }
    }

    public GameState CheckGaneState(ArrayList list, ComputerCamp cp) {
        if(cp.doneValue == 0) {
            return GameState.win;
        }
        else if(list.size()==0 || cp.remainDays <= 0) {
            return GameState.lose;
        }
        else {
            return GameState.conti;
        }
    }

    public void setYSDayState(Character ch, ComputerCamp cp, int i) {
        TaskState t = ch.getTaskState(i);
        if(ch.checkMotion()){
            switch (t) {
                case work:
                    setYSspecialMove(ch,i);
                    cp.finishpart(ch.getWorkAbility());
                    ch.getHurt(ch.getWorkAbility()*5);
                    break;
                case specialwork:
                    setYSspecialMove(ch,i);
                    cp.finishpart(ch.getWorkAbility());
                    ch.getHurt(ch.getWorkAbility()*5);
                    break;
                case none:
                    ch.getHurt(ch.breakMotionValue());
                default:
                    break;
            }
            
        }
        else{
            System.out.println(cp.getList());
            cp.removeCharacter(ch);
            System.out.println(cp.getList());
        }
    }
}