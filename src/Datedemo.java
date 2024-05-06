import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sd=new SimpleDateFormat("yyyy/MMMM/dd");
        String datestr=sd.format(date);
        System.out.println(datestr);

    }
}
