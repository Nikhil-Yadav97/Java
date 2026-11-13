import java.io.FileNotFoundException;
import java.io.FileReader;

public class Prog9 {
    public static void main(String[] args) {
       try {
         readFile();
       }
       catch(FileNotFoundException e) {

       }
    }


    private static void readFile() throws FileNotFoundException {
        //either handle exept or use throws that tell parent to handle exception
        FileReader fr = new FileReader("abc.txt");
    }
}

// Checked Exceptions --> throws