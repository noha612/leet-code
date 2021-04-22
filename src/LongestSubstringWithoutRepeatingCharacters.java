import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("dvdf"));
        System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("cdd"));
    }

    public int lengthOfLongestSubstring(String s) {
        int r = 0;
        List<Character> l = new ArrayList<>();
        for (char i : s.toCharArray()) {
            if (l.indexOf(i) == -1) {
                l.add(i);
            } else {
                r = Math.max(l.size(), r);
                while (l.get(0) != i) {
                    l.remove(0);
                }
                l.remove(0);
                l.add(i);
            }
        }
        return Math.max(l.size(), r);
    }
}
