package waitAndnotify.pipeReaderWriter;

import java.io.PipedReader;


public class ThreadRead implements Runnable{
    private ReadData readData;
    private PipedReader inputStream;

    public ThreadRead(ReadData readData,PipedReader inputStream){
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.reader(inputStream);
    }
}
