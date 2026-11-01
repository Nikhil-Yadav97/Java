import java.io.*;

public class Prog3 {
    public static void main(String[] args) throws IOException {

        // read bytes from os buffer
        InputStreamReader isr = new InputStreamReader(System.in);

        // byte stream to char stream into buffer
        BufferedReader br = new BufferedReader(isr);

        String name = br.readLine();
        // read till encountering newline char
        System.out.println(name);
    }
}
