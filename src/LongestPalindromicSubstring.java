public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("a"));
    }

    public String longestPalindrome(String s) {
        char[] c = s.toCharArray();
        String r = "";
        String R = s.charAt(0) + "";
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                int j = i;
                int k = i + 1;
                while (j != -1 && k != c.length && c[j] == c[k]) {
                    r = c[j] + r;
                    r += c[k];
                    j--;
                    k++;
                }
                if (r.length() > R.length()) R = r;
                r = "";
            }
            if (i > 0 && c[i - 1] == c[i + 1]) {
                int j = i - 1;
                int k = i + 1;
                r += c[i];
                while (j != -1 && k != c.length && c[j] == c[k]) {
                    r = c[j] + r;
                    r += c[k];
                    j--;
                    k++;
                }
                if (r.length() > R.length()) R = r;
                r = "";
            }
        }
        return R;
    }
}
