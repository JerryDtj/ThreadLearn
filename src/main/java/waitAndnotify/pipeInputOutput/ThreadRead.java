package waitAndnotify.pipeInputOutput;

import java.io.PipedInputStream;

public class ThreadRead implements Runnable{
    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData,PipedInputStream inputStream){
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.Read(inputStream);
    }
}
