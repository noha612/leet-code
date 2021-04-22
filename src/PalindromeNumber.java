public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return (x + "").equals(new StringBuilder(x + "").reverse().toString());
    }

}
