import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis =new FileInputStream("D:\\Decision science .pdf");
        System.out.println("end of the file");
    }
}
