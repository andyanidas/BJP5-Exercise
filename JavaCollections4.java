import java.util.*;

public class JavaCollections4 {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list2 = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);
        System.out.println(countCommon(list1,list2));
    }
    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> s1 = new HashSet<>(list1);
        Set<Integer> s2 = new HashSet<>(list2);
        s1.retainAll(s2);
        return s1.size();
    }
}
