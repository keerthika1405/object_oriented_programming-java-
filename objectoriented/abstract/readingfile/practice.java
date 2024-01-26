package readingfile;
import java.io.IOException;

public class practice{
public static void main(String[] args) throws IOException{

    DigitalOnlyFileReader digitalOnlyFileReader= new DigitalOnlyFileReader("test.txt");

        System.out.println(digitalOnlyFileReader.getpath());
        System.out.println(digitalOnlyFileReader.readFile());
    }
}
