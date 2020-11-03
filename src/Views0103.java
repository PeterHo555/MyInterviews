public class Views0103 {
    public String replaceSpaces(String S, int length) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < S.trim().length(); i++) {
            if (S.charAt(i) == ' ')
                sb.append("%20");
            else
                sb.append(S.charAt(i));
        }
        return sb.toString();
    }
}
