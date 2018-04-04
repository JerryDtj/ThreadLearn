package waitAndnotify.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Test {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            inputStream.connect(outputStream);

            Thread read = new Thread(new ThreadRead(readData,inputStream));
            read.start();
            Thread.sleep(2000);
            Thread write = new Thread(new ThreadWrite(writeData,outputStream));
            write.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
