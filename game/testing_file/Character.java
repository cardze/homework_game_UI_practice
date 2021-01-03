package game.testing_file;

public abstract class Character {

    protected int workAbility;
    protected int motionValue;
    protected int breakMotionValue;
    protected String name;
    protected TaskState[] calender;
    public int breakMotionValue() {
        return -breakMotionValue;
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

    public void setworkAbility(int workAbility) {
        this.workAbility = workAbility;
    }
    
    public TaskState getTaskState(int i) {
        return calender[i];
    }
    
    public void setTaskState(int i, TaskState tk) {
        this.calender[i] = tk;
    }

    
    // public abstract void skill();
    // public abstract void passive();

    public void getHurt(int i){
        this.motionValue -= i;
        if(motionValue < 0) {
            motionValue = 0;
        }
    }

    public boolean checkMotion(){
        if(motionValue <= 0)
            return false;
        return true;
    }
}