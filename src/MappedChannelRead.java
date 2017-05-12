/**
 * Created by Mihnea on 05.05.2017.
 */
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {
        // Obtain chanel to a file
        try(FileChannel fChan = (FileChannel)Files.newByteChannel(Paths.get("Test.txt"))) {
            // Get the size of the file
            long fSize = fChan.size();
            // Map the file into a buffer
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);
            //Read and display bytes from buffer
            for(int i=0;i<fSize;i++)
                System.out.print((char)mBuf.get());
            System.out.println();
        }catch (InvalidPathException e) {
            System.out.println("Path error "+e);
        }catch (IOException e){
            System.out.println("I/O error "+e);
        }
    }
}

