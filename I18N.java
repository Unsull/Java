import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import java.util.TimeZone;

public class I18N {
    public static void main(String[] args) {
        Date date = new Date();
        int dfLong = DateFormat.LONG;
        int dfMedium = DateFormat.MEDIUM;

        DateFormat dfJP = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.JAPAN);
        DateFormat dfUS = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.US);
        DateFormat dfFR = DateFormat.getDateTimeInstance(dfLong, dfMedium, Locale.FRANCE);

        dfJP.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        dfUS.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        dfFR.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));

        System.out.println("Japan: " + dfJP.format(date) + " in Japan Time Zone");
        System.out.println("US: " + dfUS.format(date) + " in US Time Zone");
        System.out.println("France: " + dfFR.format(date) + " in France Time Zone");
    }
}
