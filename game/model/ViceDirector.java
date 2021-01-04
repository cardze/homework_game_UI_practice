package game.model;

public class ViceDirector extends Role {
    ViceDirector(){
        this.name = "副會長";
        this.motionValue = 100;
        this.workAbility = 1;
        this.naturalRecoverRate = 15;
        this.calender = new TaskState[5];
        for (int i = 0; i < 5; i++) {
            calender[i] = TaskState.NONE;
        }
    }

    public TaskState getTodayEvent(int i) {
        return calender[i];
    }

    public void setEvent(int i,TaskState task){
        calender[i] = task;
    }
    //set specific days event
}
