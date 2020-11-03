public class Views0106 {
    public String compressString(String S) {
        if(S == null || S.length() <= 2) return S;
        int cnt = 1;
        StringBuffer sb = new StringBuffer();
        sb.append(S.charAt(0));
        for(int i = 1; i < S.length(); i++){
            // 如果i和i-1相同则cnt累加
            if(S.charAt(i) == S.charAt(i - 1)) {
                cnt++;
            } else{
                // 拼接上一次i-1的次数，从i开始重新计数
                sb.append(cnt).append(S.charAt(i));
                cnt = 1;
            }
        }
        sb.append(cnt);
        return sb.toString().length() < S.length()? sb.toString():S;
    }
}
