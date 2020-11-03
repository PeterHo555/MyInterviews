import java.util.HashMap;

public class Views0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0) + 1);
        }
        for(int i = 0; i < s2.length(); i++){
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i),0) + 1);
        }
        if (map1.size() != map2.size()) return false;
        for (char c : map1.keySet()) {
            if (map1.get(c) != map2.get(c)) {
                return false;
            }
        }
        return true;
    }
}
