import java.util.*;

public class BJP5altarnate {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10, 11, 12);
        System.out.println(alternate(list1, list2));

    }
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        if(list1.size()<list2.size()){
            alternate(list2,list1);
        }
        List<Integer> newList = new ArrayList<Integer>();
        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();
        if(!itr2.hasNext()){
            newList=list1;
        }
        while(itr2.hasNext()){
            if(itr1.hasNext()){
                newList.add(itr1.next());
            }
            newList.add(itr2.next());
        }

        return newList;
    }
}
