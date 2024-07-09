package JAVA;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFor {

    public static void main(String[] args) {
        System.out.println(getIpaasDateFormat("2024-06-06 10.57.24.093000000"));
        System.out.println(getIpaasDateFormat("2024-JUN-06 10.57.24.000000000"));
    }
    public static String getIpaasDateFormat(String timestampString) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss[.SSS]");
        LocalDateTime dateTime = LocalDateTime.parse(timestampString, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        return dateTime.format(outputFormatter);
    }
}
