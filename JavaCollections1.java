import java.util.*;

public class BJP5removeInRange {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<11;i++){
            list.add(i);
            if(i==9){
                list.add(i);
                list.add(i);
            }
        }
        System.out.println(list);
        removeInRange(list,9,8,10);
        System.out.println(list);

    }
    public static void removeInRange(List<Integer> list, int value, int min, int max) {
        for(int i = min; i<max;i++){
        if(list.get(i)==value){
            System.out.println("removing: " + i + "th element and value: " + value);
            list.remove(i);
            max--;
            i--;
        }
    }
    }
}
