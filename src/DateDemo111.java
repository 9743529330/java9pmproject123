import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo111 {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sd=new SimpleDateFormat("dd/MMMM/yyyy | hh:mm:ss");
        String datestr=sd.format(date);
        System.out.println(datestr);
        System.out.println(date);
        SimpleDateFormat sd0=new SimpleDateFormat("dd-MM-yy | EEEE hh:mm:ss");
        String datestr0=sd0.format(date);
        System.out.println(datestr0);
        SimpleDateFormat sd1=new SimpleDateFormat("yyyy/MMMM/dd | EEEE hh:mm:ss");
        String datestr1=sd1.format(date);
        System.out.println(datestr1);
        SimpleDateFormat sd2=new SimpleDateFormat("EEEE | dd-MMMM-yyyy hh:mm:ss");
        String datestr2=sd2.format(date);
        System.out.println(datestr2);
    }
}
