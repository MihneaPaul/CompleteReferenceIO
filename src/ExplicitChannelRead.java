/**
 * Created by Mihnea on 05.05.2017.
 */
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath=null;

        // First, obtain a path to a file
//        try{
//            filepath=Paths.get("Test.txt");
//        }catch (InvalidPathException e) {
//            System.out.println("Path Error "+e);
//            return;
//        }
        // Next, obtain a channel to that file within a try-with-resources block.
        try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("Test.txt"))) {
            // Allocate a buffer
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                // Read a buffer
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println();
        }catch (InvalidPathException e) {
            System.out.println("Path exception "+e);
        }catch (IOException e) {
            System.out.println("I/O Exception "+e);
        }
    }
}
