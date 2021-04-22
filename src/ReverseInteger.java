import java.math.BigDecimal;
import java.math.BigInteger;

public class ReverseInteger {
    public static void main(String[] args) {
        new ReverseInteger().reverse(-123);
    }

    public int reverse(int x) {
        String s = new StringBuilder(x + "").reverse().toString();
        if (s.charAt(s.length() - 1) == '-') s = '-' + s.substring(0, s.length() - 1);
        long l = Long.parseLong(s);
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) return 0;
        return (int) l;
    }
}
