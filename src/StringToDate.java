import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String datestr="10-06-1990 | 02:30:45 Thursday";
        System.out.println("datestr=" +datestr);
        SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy | hh:mm:ss EEEE");
        Date date1=sd.parse(datestr);
        System.out.println(date1);
    }
}
