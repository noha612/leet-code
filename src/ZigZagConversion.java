import java.util.ArrayList;

public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().convert("AB", 2));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        ArrayList<ArrayList<Character>> main = new ArrayList<>();
        for (int i = 0; i < numRows; i++) main.add(new ArrayList<Character>());
        boolean down = true;
        int curRow = 0;
        for (char i : s.toCharArray()) {
            main.get(curRow).add(i);
            if (curRow == 0 && !down) down = true;
            if (curRow == numRows - 1 && down) down = false;
            if (down) curRow++;
            else curRow--;
        }
        String r = "";
        for (ArrayList<Character> l : main) {
            for (Character i : l) r += i;
        }
        return r;
    }
}
