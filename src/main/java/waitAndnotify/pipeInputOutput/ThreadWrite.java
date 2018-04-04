package waitAndnotify.pipeInputOutput;

import java.io.PipedOutputStream;

public class ThreadWrite implements Runnable {
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData data, PipedOutputStream out){
        this.writeData = data;
        this.outputStream = out;
    }


    @Override
    public void run() {
        writeData.write(outputStream);
    }
}
