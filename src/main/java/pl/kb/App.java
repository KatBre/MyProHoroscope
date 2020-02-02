package pl.kb;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println("What is your birth day?");
        Integer day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your month of birth?");
        Integer month = scanner.nextInt();
        LocalDate dateOfBirth = LocalDate.of(2020, month, day);
//
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
        }
        System.out.println(horoscopeMessage);
    }
}
