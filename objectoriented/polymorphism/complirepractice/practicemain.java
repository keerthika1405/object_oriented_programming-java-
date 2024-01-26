package complirepractice;
import java.util.ArrayList;
import java.util.function.Predicate;

public class practicemain {
    public static void main(String[] args) {
        Predicate<Integer> isdivisiblebythree = n -> Math.abs(n) % 3 == 0;

         conditionArrayList list1=new conditionArrayList(isdivisiblebythree);
         System.out.println(list1);

         conditionArrayList list2=new conditionArrayList(isdivisiblebythree,1,2,3,4,5,6,7,8);
        System.out.println(list2);

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(9);
        conditionArrayList list3=new conditionArrayList(isdivisiblebythree,list);
        System.out.println(list3);

        Predicate<Integer> isdivisiblebysix = n -> Math.abs(n) % 6 == 0;
        conditionArrayList list4=new conditionArrayList(isdivisiblebysix, list2);
        System.out.println(list4);
    }


}
