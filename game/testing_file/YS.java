package game.testing_file;

public class YS extends Character {

    //int week[];
    // to count how many days my skill can still work
    public YS() {
        this.name = "副會長";
        this.motionValue = 100;
        this.workAbility = 1;
        this.breakMotionValue = 15;
        this.calender = new TaskState[5];
        for (int i = 0; i < 5; i++) {
            calender[i] = TaskState.none;
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