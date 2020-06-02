import java.util.*;

public class JavaCollections5 {

    public static void main(String[] args){
        Set<String> s = new HashSet<>();
        s.add("one");
        s.add("two");
        s.add("three");
        s.add("four");
        s.add("get");
        s.add("person");
        System.out.println(maxLength(s));

    }
    public static int maxLength(Set<String> set) {
        int maxLen = 0;
        for(String s: set){
            if(maxLen<s.length()){
                maxLen = s.length();
            }
        }
        return maxLen;
    }
}
