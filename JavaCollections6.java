import java.util.*;
public class JavaCollections6 {
    public static void main(String[] args){
        Set<Integer> s = new HashSet<>();
        s.add(1);
        System.out.println(hasOdd(s));
    }
    public static boolean hasOdd(Set<Integer> set) {
        for(Integer i: set){
            if(i%2==1) return true;
        }
        return false;
    }

}
