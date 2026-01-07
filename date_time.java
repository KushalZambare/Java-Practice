import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String findDay(int month, int day, int year) {
        if(month<1 || month>12 || day<1 || day>31 || year<2000 || year>3000){
            return "Invalid Date";
        };
        String[] day_of_week = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int p = cal.get(Calendar.DAY_OF_WEEK);
        return day_of_week[p-1];
    
    }

}

public class date_time {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Monthe");
        int month = scanner.nextInt();
        System.out.println("Enter Day");
        int day = scanner.nextInt();
        System.out.println("Enter Year");
        int year = scanner.nextInt();
        System.out.println(Result.findDay(month, day, year));
        scanner.close();
    }
}