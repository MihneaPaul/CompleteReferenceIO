/**
 * Created by Mihnea on 05.05.2017.
 */
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        // Obtain a channel to a file
        try(FileChannel fChan = (FileChannel)Files.newByteChannel(Paths.get("Text.txt"),StandardOpenOption.WRITE,StandardOpenOption.CREATE)) {
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            for(int i=0;i<26;i++)
                mBuf.put((byte)('A'+i));
            mBuf.rewind();
            fChan.write(mBuf);
        }catch (InvalidPathException e) {
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
