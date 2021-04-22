public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(new RomantoInteger().romanToInt("MCMXCIV"));
    }

    public int romanToInt(String r) {
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
        //IV = 4
        //IX = 9
        //XL = 40
        //XC = 90
        //CD = 400
        //CM = 900
        int num = 0;
        while (r.length() > 0) {
            if (r.endsWith("CM")) {
                num += 900;
                r = r.substring(0, r.length() - 2);
            }
            else if (r.endsWith("CD")) {
                num += 400;
                r = r.substring(0, r.length() - 2);
            }
            else if (r.endsWith("XC")) {
                num += 90;
                r = r.substring(0, r.length() - 2);
            }
            else if (r.endsWith("XL")) {
                num += 40;
                r = r.substring(0, r.length() - 2);
            }
            else if (r.endsWith("IX")) {
                num += 9;
                r = r.substring(0, r.length() - 2);
            }
            else if (r.endsWith("IV")) {
                num += 4;
                r = r.substring(0, r.length() - 2);
            }
            else if (r.endsWith("M")) {
                num += 1000;
                r = r.substring(0, r.length() - 1);
            }
            else if (r.endsWith("D")) {
                num += 500;
                r = r.substring(0, r.length() - 1);
            }
            else if (r.endsWith("C")) {
                num += 100;
                r = r.substring(0, r.length() - 1);
            }
            else if (r.endsWith("L")) {
                num += 50;
                r = r.substring(0, r.length() - 1);
            }
            else if (r.endsWith("X")) {
                num += 10;
                r = r.substring(0, r.length() - 1);
            }
            else if (r.endsWith("V")) {
                num += 5;
                r = r.substring(0, r.length() - 1);
            }
            else if (r.endsWith("I")) {
                num += 1;
                r = r.substring(0, r.length() - 1);
            }
        }
        return num;
    }
}
