package game.testing_file;

class test {
    public static void main(String[] args) {
        ComputerCamp cp = new ComputerCamp();
        CountDay cd = new CountDay();
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(ys.getTaskState(i));
        // }
        for (int i = 0; i < 4; i++) {
            cp.getListIndex(0).setTaskState(i,TaskState.work);
        }
        // for (int i = 0; i < 5; i++) {
        //     System.out.print(ys.getTaskState(i));
        // }
        cd.setYSWeekSkill((YS)cp.getListIndex(0));
        for (int i = 0; i < 5; i++) {
            System.out.println(cp.getListIndex(0).getTaskState(i));
        }
        // System.out.println(cp.getList());
        // cd.runDay(cp.getList(), cp);
        // System.out.println(cp.getList());
        // cd.runDay(cp.getList(), cp);
        // System.out.println(cp.getList());
        // System.out.println(cp.getDoneValue());
        // System.out.println(ys.getMotionValue());
        // cd.runDay(cp.getList(), cp);
        // System.out.println(cp.getList());
        // System.out.println(cp.getDoneValue());
        // System.out.println(ys.getMotionValue());
        cd.runDay(cp.getList(), cp);
        cd.runDay(cp.getList(), cp);
        cd.runDay(cp.getList(), cp);
        cd.runDay(cp.getList(), cp);
        cd.runDay(cp.getList(), cp);
        cd.runDay(cp.getList(), cp);
        cd.runDay(cp.getList(), cp);
        // System.out.println(cp.getDoneValue());
        // System.out.println(ys.getMotionValue());
    }
}