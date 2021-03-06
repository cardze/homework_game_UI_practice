package game.model;

public class ActivitiesDirector extends Role {
    ActivitiesDirector(){
        this.name = "活動長";
        this.motionValue = 100;
        this.workAbility = 1;
        this.naturalRecoverRate = 15;
        this.calender = new TaskState[5];
        for (int i = 0; i < 5; i++) {
            calender[i] = TaskState.NONE;
        }
    }
}
