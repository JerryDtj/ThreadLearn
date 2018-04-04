package waitAndnotify.pipeInputOutput;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class WriteData {
    public void write(PipedOutputStream outputStream){
        try {
            AtomicInteger atomicInteger = new AtomicInteger();
            System.out.print("WriteData:");
            while (atomicInteger.get()<50){
                Integer i = atomicInteger.get();
                outputStream.write(i.toString().getBytes());
                System.out.print(atomicInteger.get());
                atomicInteger.incrementAndGet();
            }
            System.out.println();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
