import java.util.*;

public class JavaCollections3 {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(4, 2, 4, 2, 4, 4, 4, 2, 2, 2);

        System.out.println(countUnique(list));
    }
    public static int countUnique(List<Integer> list) {
        Set<Integer> s = new HashSet<>(list);
        return  s.size();
    }
}
