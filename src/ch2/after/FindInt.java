package ch2.after;

public class FindInt {
    public static boolean find(int[] data, int target){
        //찾았다 라는 변수명으로 변경
        boolean found = false;
        for(int i=0; i<data.length; i++){
            if(data[i] == target){
                //return으로 처리
                return true;
            }
        }
        return false;
    }
}
