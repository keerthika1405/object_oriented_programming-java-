package addrandom;

// package polymorphism;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;


public class conditionoddArrayList extends ArrayList<Integer>{
//constructor -->instialize an object 

private Predicate<Integer> condition;
    public conditionoddArrayList(Predicate<Integer> predicate, Integer... nums){
         super(Arrays.stream(nums)
         .filter(predicate)
         .collect(Collectors.toList()));
         this.condition=predicate;
    }

    public boolean isEligible(Integer element){
        return condition.test(element);
    }


    
    @Override
    public void add(int index, Integer element){
    if(Math.abs(element) % 2==1){
        super.add(index,element);
    }
    }


    @Override
    public boolean add(Integer element){
        if(Math.abs(element) % 2==1){
          return  super.add(element);
        }
        else{
            return false;
        }
    }


    @Override
    public boolean addAll(Collection<? extends Integer> c){
    return super.addAll(c.stream()
    .filter(this::isEligible)
    .collect(Collectors.toList()));
    }


    @Override
    public boolean addAll(int index,Collection<? extends Integer> c){
    return super.addAll(index, c.stream()
    .filter(this::isEligible)
    .collect(Collectors.toList()));
    }
 
   
    @Override
    public Integer set(int index,Integer element){
    if(isEligible(element)){
        return super.set(index,element);
    }
    else{
        System.out.println(element+"is not odd.");
        return Integer.MIN_VALUE;
    }
}

    @Override
    public void replaceAll(UnaryOperator<Integer> operator){
        super.replaceAll(operator);
        super.removeIf(n -> !isEligible(n));

    }

}