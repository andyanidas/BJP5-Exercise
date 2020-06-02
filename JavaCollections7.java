import java.util.*;
public class JavaCollections6 {
    public static void main(String[] args){
        List<String> s = new ArrayList<>();
        s.add("foo");
        s.add("buzz");
        s.add("bar");
        s.add("bar");
        s.add("bar");
        s.add("spoon");
        s.add("!");
        s.add("dude");
        System.out.println(contains3(s));
        //removeEvenLength(s);


       // System.out.println(hasOdd(s));
    }
    public static boolean contains3(List<String> list) {
        Map<String, Integer> MapS = new HashMap<>();
        for(String s: list){
            if(MapS.containsKey(s)){
                int count = MapS.get(s);
                MapS.put(s,count+1);
            }else{
                MapS.put(s,1);
            }
        }
        for(String s: MapS.keySet()){
            int count = MapS.get(s);
            if(count>2){
                return true;
            }
        }
        return  false;
    }

}
