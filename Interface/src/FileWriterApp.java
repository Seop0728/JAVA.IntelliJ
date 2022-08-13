import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterApp {
    public static void main(String[] args) throws IOException {
        Writer fw = new FileWriter("filewriter.txt");

        fw.write("data 1");
        fw.write("data 2");
        fw.write("data 3");

        fw.close();


    }
}
