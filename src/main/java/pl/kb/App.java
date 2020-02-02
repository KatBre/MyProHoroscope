package pl.kb;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        System.out.println("Give me your zodiac sign: ");
        String zodiacSign = new Scanner(System.in).nextLine().toLowerCase();
        String requestResult = Connector.getPage(zodiacSign);
        String horoscopeMessage = "";
        if (!requestResult.equals(Connector.NOT_FOUND)) {
            horoscopeMessage = HoroscopeExtractor.getHoroscopeText(requestResult);
            System.out.println(horoscopeMessage);
        }
    }
}
