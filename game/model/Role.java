package game.model;

public class Role {

    protected int workAbility;
    protected int motionValue;
    protected int naturalRecoverRate;
    protected String name;
    protected TaskState[] calender;
    public int breakMotionValue() {
        return -naturalRecoverRate;
    }
    public int getWorkAbility() {
        return workAbility;
    }

    public int getMotionValue() {
        return motionValue;
    }

    public String getName(){
        return name;
    }

    public void setWorkAbility(int workAbility) {
        this.workAbility = workAbility;
    }
    
    public TaskState getTaskState(int i) {
        return calender[i];
    }
    
    public void setTaskState(int i, TaskState tk) {
        this.calender[i] = tk;
    }


    public void getHurt(int i){
        this.motionValue -= i;
        if(motionValue < 0) {
            motionValue = 0;
        }
    }

    public boolean checkMotion(){
        return motionValue > 0;
    }
}