import java.util.HashSet;

public class Views0101 {
    public boolean isUnique(String astr) {
        HashSet<Character> set = new HashSet<>();
        for (char c: astr.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
