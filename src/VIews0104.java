import java.util.HashMap;

public class VIews0104 {
    public boolean canPermutePalindrome(String s) {
        // 最多只能有一个单数
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (char c : map.keySet()) {
            if (map.get(c) %2 == 1){
                count++;
                if (count > 1) return false;
            }
        }
        return true;
    }
}
