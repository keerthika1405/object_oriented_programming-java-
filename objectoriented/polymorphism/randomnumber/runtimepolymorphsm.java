// package randomnumber;
// adding one random number to arraylist and list


import java.util.ArrayList;
import java.util.Random;

public class runtimepolymorphsm {
    
    public static void addrandomnumber(ArrayList<Integer> listy){
        int originalsize=listy.size();
        Random random =new Random();
        while(originalsize +1!=listy.size() ){
            int n=random.nextInt(1000);
            listy.add(n);
        }
    }

public static void main(String[] args) {

    oddArrayList oddlist= new oddArrayList();
    oddlist.add(1);
    oddlist.add(2);
    addrandomnumber(oddlist);
    System.out.println(oddlist);

    ArrayList<Integer> list= new ArrayList<>();
    list.add(1);
    list.add(2);
    addrandomnumber(list);
    System.out.println(list);
}    
}
