package ch1.after1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Andrew");
        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.JUMP);
        robot.order(Robot.Command.STOP);
    }
}
