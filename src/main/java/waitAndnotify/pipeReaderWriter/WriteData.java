package waitAndnotify.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedWriter;
import java.util.concurrent.atomic.AtomicInteger;

public class WriteData {
    public void write(PipedWriter writer){
        try {
            AtomicInteger atomicInteger = new AtomicInteger();
            System.out.print("writer:");
            while (atomicInteger.get()<50){
                Integer num = atomicInteger.get();
                writer.write(num.toString());
                System.out.print(num);
                atomicInteger.incrementAndGet();
            }
            System.out.println();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
