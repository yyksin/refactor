package ch1.after;

public class Robot {
    private final String name;
    public static final int COMMAND_WORK=100;
    public static final int COMMAND_STOP=200;
    public static final int COMMAND_JUMP=300;

    public Robot(String name){
        this.name = name;
    }

    public void order(int command){
        if(command==COMMAND_WORK){
            System.out.println(name+" walks");
        }else if(command==COMMAND_STOP){
            System.out.println(name+" stops");
        }else if(command==COMMAND_JUMP){
            System.out.println(name+" jumps");
        }else{
            System.out.println("Command error. command="+command);
        }
    }


}
