import java.io.IOException;
// need to throw exception for using System.in
public class Prog2 {
    public static void main(String[] args) throws IOException {
        int x = System.in.read();
        // read() reads only single byte and only number
        System.out.println((char) x);
    }
}
