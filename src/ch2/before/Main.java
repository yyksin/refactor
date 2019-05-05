package ch2.before;

public class Main {
    public static void main(String[] args) {
        int[] data = {1,9,0,2,8,5,6,3,4,7};
        if(FindInt.find(data,5)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
