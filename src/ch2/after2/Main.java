package ch2.after2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        SimpleDataBase db = new SimpleDataBase(new FileReader("dbFile.txt"));
        Iterator<String> it = db.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println("key : "+key);
            System.out.println("value : "+db.getValue(key));
            System.out.println();
        }
    }
}
