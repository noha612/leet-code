import java.math.BigDecimal;
import java.math.BigInteger;

public class StringtoInteger {
    public static void main(String[] args) {
        System.out.println(new StringtoInteger().myAtoi("42"));
    }

    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() < 1) return 0;
        String r = "";
        int start = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            r += s.charAt(0);
            start = 1;
        }
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                r += s.charAt(i);
            } else break;
        }
        if (r.length() < 1 || r.equals("+") || r.equals("-")) return 0;
        Double l = Double.parseDouble(r);
        if (l > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (l < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return Integer.parseInt(r);
    }
}
