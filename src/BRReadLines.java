/**
 * Created by Mihnea on 02.05.2017.
 */
import java.io.*;
public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string;
        System.out.println("Enter lines of text.");
        System.out.println("Enter stop to quit.");
        do {
            string=br.readLine();
//            System.out.println(string);
        }while(!string.equals("stop"));

    }
}
class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string[] = new String[100];
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        for (int i = 0; i < 100; i++) {
            string[i] = br.readLine();
            if (string[i].equalsIgnoreCase("stop")) break;
        }
        System.out.println("\nHere is your file");
        for (int i = 0; i < 100; i++) {
            if (string[i].equalsIgnoreCase("stop")) break;
            System.out.println(string[i]);
        }
    }
}
class WriteDemo {
    public static void main(String[] args) {
        int b;
        b='A';
        System.out.write(b);
        System.out.write('\n');
    }
}
class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("This is a String");
        int i = -7;
        pw.println(i);
        double d=4.5e-7;
        pw.println(d);
    }
}
