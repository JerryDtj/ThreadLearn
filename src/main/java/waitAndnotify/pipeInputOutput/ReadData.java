package waitAndnotify.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
    public void Read(PipedInputStream inputStream){
        try {
            byte[] bytes = new byte[20];
            int readLength = inputStream.read(bytes);
            System.out.print("readData:");
            while (readLength!=-1){
                String s = new String(bytes,0,readLength);
                System.out.print(s);
                readLength = inputStream.read(bytes);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
