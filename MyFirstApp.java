

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyFirstApp {

    public static void main(String[] args) {
        System.out.println("My name is Kristine Ianna A. Evasco");
        
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        String formattedDate = myDateObj.format(myFormatObj);   
        System.out.println("The current date and time is: " + formattedDate );
    }
}