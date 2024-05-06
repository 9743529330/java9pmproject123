import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) throws ParseException {
      /*  String datestr="06-02-1985";
        System.out.println("datestr=" +datestr);
        SimpleDateFormat sd1=new SimpleDateFormat("dd-MM-yyyy");
        Date date1=sd1.parse(datestr);
        System.out.println(date1);*/
        Date date=new Date();
        System.out.println(date);

    }
}
