import java.text.DecimalFormat;

public class Formatter {

    private static final DecimalFormat format = new DecimalFormat("#,###.000");

    public static String format(double value) {
        return format.format(value);
    }
}
