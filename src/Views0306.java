import java.util.ArrayList;
import java.util.List;

public class Views0306 {
    List<int[]> list;
    public Views0306() {
        list=new ArrayList<>();
    }

    public void enqueue(int[] animal) {
        list.add(animal);
    }

    public int[] dequeueAny() {
        return list.size() == 0 ? new int[]{-1,-1} : list.remove(0);
    }

    public int[] dequeueDog() {
        for(int i=0;i<list.size();i++){
            if(list.get(i)[1]==1){
                return list.remove(i);
            }
        }
        return new int[]{-1,-1};
    }

    public int[] dequeueCat() {
        for(int i=0;i<list.size();i++){
            if(list.get(i)[1]==0){
                return list.remove(i);
            }
        }
        return new int[]{-1,-1};
    }
}
