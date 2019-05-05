package ch3.before;

public class SortSample {
    private final int[] data;
    public SortSample(int[] data){
        this.data = new int[data.length];
        System.arraycopy(data,0, this.data,0, data.length);
    }
    public void sort(){
        for(int x=0; x<data.length-1; x++){
            int m=x;
            for(int y=x+1; y<data.length; y++){
                if(data[m] > data[y]){
                    m=y;
                }
            }
            //data[x]~data[data.length-1]의 최소값이어야 함
            int v = data[m];
            data[m] = data[x];
            data[x] = v;
            //data[0] ~ data[x+1]은 이미 정렬되어 있어야 함
        }
    }

    public String toString(){
        StringBuilder buffer = new StringBuilder();
        buffer.append("[ ");
        for(int i=0; i<data.length; i++){
            buffer.append(data[i]);
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }
}
