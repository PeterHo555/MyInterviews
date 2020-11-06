public class Views0109 {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.length()!=s2.length())//不等长
            return false;
        if(s1.length()==0){//都是空的
            return true;
        }
        //这里假设 s1是有序的。
        // s2是s1轮转结果
        s2=s2+s2;
        return	s2.contains(s1);
    }
}
