import java.util.ArrayList;
import java.util.LinkedList;

public class Views0303 {
    int maxcaps;//每个栈的最大cap数
    LinkedList list = new LinkedList();//存储栈的linkedlist,因为linkedlist增删快
    public Views0303(int cap) {
        this.maxcaps = cap;
    }

    public void push(int val) {
        if(maxcaps<=0)
            return;
        if(list.isEmpty()){
            ArrayList arr = new ArrayList();//用来当做栈，存储元素的，arraylist查询较快
            arr.add(val);
            list.add(arr);
        }
        else{
            ArrayList oldarr =(ArrayList) list.get(list.size()-1);
            if(oldarr.size()==maxcaps){
                ArrayList arr = new ArrayList();
                arr.add(val);
                list.add(arr);
            }
            else{
                oldarr.add(val);//最后一个没有满
            }
        }
    }

    public int pop() {
        if(list.size()==0)
            return -1;
        ArrayList oldarr =(ArrayList) list.get(list.size()-1);
        int re = (int)oldarr.get(oldarr.size()-1);
        oldarr.remove(oldarr.size()-1);//删掉pop的元素
        if(oldarr.size()==0){
            list.remove(oldarr);//删掉空的栈
        }
        return re;
    }

    public int popAt(int index) {
        if(list.size()==0 || index>list.size()-1)
            return -1;
        ArrayList oldarr =(ArrayList) list.get(index);
        int re = (int)oldarr.get(oldarr.size()-1);
        oldarr.remove(oldarr.size()-1);//删掉pop的元素
        if(oldarr.size()==0){
            list.remove(oldarr);//删掉空的栈
        }
        return re;

    }
}
