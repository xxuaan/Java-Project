package Lab03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String [] args){
        Date now = new Date();
        System.out.println("Current Date: " + now);

        Calendar c = Calendar.getInstance();
        c.setTime(now);
        c.add(Calendar.DATE, 7); // Adding 7 days
        Date added = c.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = sdf.format(added);
        System.out.println("Formatted Date: " + formattedDate);
    }
}