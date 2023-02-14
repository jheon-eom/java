package java_static;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommonUtils {

    public static LocalDateTime stringToLocalDateTime(String strDate) {
        return LocalDateTime.parse(strDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static String localDateTimeToString(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

//    public static boolean isEmailValid(String email) {
//        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
//    }

}
