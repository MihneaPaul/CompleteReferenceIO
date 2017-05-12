/**
 * Created by Mihnea on 05.05.2017.
 */
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        try {
            Path source = Paths.get("Test.txt");
            Path destination = Paths.get("TestCopy.ext");
            Files.copy(source,destination);
        }catch (IOException e) {
            System.out.println("I/O error "+e);
        }catch (InvalidPathException e) {
            System.out.println("Path error "+e);
        }
    }
}
