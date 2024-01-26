package addrandom;
import java.util.ArrayList;
import java.util.Random;


public class mainclass {
    
    public static void addrandomnumber(ArrayList<Integer> listy){
        int originalsize=listy.size();
        Random random =new Random();
        while(originalsize +1!=listy.size() ){
            int n=random.nextInt(1000);
            if(listy instanceof conditionoddArrayList){
                conditionoddArrayList conditionlist=(conditionoddArrayList)listy;
                while (!conditionlist.isEligible(n)) {
                    n=random.nextInt(1000);
                }
            }
            listy.add(n);
        }
    }

public static void main(String[] args) {

    conditionoddArrayList oddlist= new conditionoddArrayList(n->Math.abs(n) % 2 == 1);
    oddlist.add(1);
    oddlist.add(2);
    addrandomnumber(oddlist);
    System.out.println(oddlist);
    
    conditionoddArrayList evenlist= new conditionoddArrayList(n->Math.abs(n) % 2 == 0);
    evenlist.add(1);
    evenlist.add(2);
    addrandomnumber(evenlist);
    System.out.println(evenlist);

    ArrayList<Integer> list= new ArrayList<>();
    list.add(1);
    list.add(2);
    addrandomnumber(list);
    System.out.println(list);
}    
}
