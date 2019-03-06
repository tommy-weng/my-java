import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(ft.format(d));
    }
}
