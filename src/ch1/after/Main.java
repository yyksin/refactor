package ch1.after;

public class Main {
    public static void main(String[] args){
        Robot robot = new Robot("Andrew");
        robot.order(Robot.COMMAND_WORK);
        robot.order(Robot.COMMAND_JUMP);
        robot.order(Robot.COMMAND_STOP);
    }
}
