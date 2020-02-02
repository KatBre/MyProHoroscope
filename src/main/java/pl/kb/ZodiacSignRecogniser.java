package pl.kb;

import java.time.LocalDate;

public class ZodiacSignRecogniser {
    public static String getSign(Integer month, Integer day) {
        String zodiacSign = "";
        if (month == 1 && day <= 19) {
            zodiacSign = "koziorożec";
        } else if ((month == 1) || (month == 2 && day <= 18)) {
            zodiacSign = "wodnik";
        } else if ((month == 2) || (month == 3 && day <= 20)) {
            zodiacSign = "ryby";
        } else if ((month == 3) || (month == 4 && day <= 19)) {
            zodiacSign = "baran";
        } else if ((month == 4) || (month == 5 && day <= 20)) {
            zodiacSign = "byk";
        } else if ((month == 5) || (month == 6 && day <= 20)) {
            zodiacSign = "bliźnięta";
        } else if ((month == 6) || (month == 7 && day <= 22)) {
            zodiacSign = "rak";
        } else if ((month == 7) || (month == 8 && day <= 22)) {
            zodiacSign = "lew";
        } else if ((month == 8) || (month == 9 && day <= 22)) {
            zodiacSign = "panna";
        } else if ((month == 9) || (month == 10 && day <= 22)) {
            zodiacSign = "waga";
        } else if ((month == 10) || (month == 11 && day <= 21)) {
            zodiacSign = "skorpion";
        } else if ((month == 11) || (month == 12 && day <= 21)) {
            zodiacSign = "strzelec";
        }
        return zodiacSign;
    }
}
