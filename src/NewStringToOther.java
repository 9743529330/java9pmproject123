import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewStringToOther {
    public static void main(String[] args) throws ParseException {
        String str1="21/01/1994";
        System.out.println("str1=" +str1);
        SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sd.parse(str1);
        System.out.println(date);
    }
}
