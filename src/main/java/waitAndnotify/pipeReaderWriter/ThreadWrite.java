package waitAndnotify.pipeReaderWriter;


import java.io.PipedOutputStream;
import java.io.PipedWriter;

public class ThreadWrite implements Runnable {
    private WriteData writeData;
    private PipedWriter writer;

    public ThreadWrite(WriteData data, PipedWriter writer){
        this.writeData = data;
        this.writer = writer;
    }


    @Override
    public void run() {
        writeData.write(writer);
    }
}
