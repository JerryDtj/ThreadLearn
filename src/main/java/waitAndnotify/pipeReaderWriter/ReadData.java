package waitAndnotify.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
    public void reader(PipedReader reader){
        try {
            char[] chars = new char[20];
            System.out.print("reader:");
            Integer length = reader.read(chars);
            while (length!=-1){
                String s = new String(chars,0,length);
                System.out.print(s);
                length = reader.read(chars);
            }
            System.out.println();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
