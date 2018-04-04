package waitAndnotify.pipeReaderWriter;


import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader reader = new PipedReader();
            PipedWriter writer = new PipedWriter();

            reader.connect(writer);

            Thread read = new Thread(new ThreadRead(readData,reader));
            read.start();
            Thread.sleep(2000);
            Thread write = new Thread(new ThreadWrite(writeData,writer));
            write.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
