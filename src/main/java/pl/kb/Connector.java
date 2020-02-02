package pl.kb;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Connector {
    public static final String NOT_FOUND = "NOT FOUND";
    private static final String URL_TEMPLATE = "https://horoskopy.gazeta.pl/horoskop/[placeholder]/dzienny";


    public static String getPage(String zodiacSign) {
        String urlTemplateWithZodiacSign = URL_TEMPLATE.replace("[placeholder]", zodiacSign);
        String requestResult;
        try {
            requestResult = Jsoup.connect(urlTemplateWithZodiacSign).get().html();
        } catch (IOException e) {
            requestResult = NOT_FOUND;
            e.printStackTrace();
        }
        return requestResult;
    }


}