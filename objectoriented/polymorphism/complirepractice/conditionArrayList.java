package complirepractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class conditionArrayList extends ArrayList<Integer> {

    private Predicate<Integer> condition;

 public conditionArrayList(Predicate<Integer> predicate, Integer...nums)  {

    super(new conditionArrayList(predicate, Arrays.asList(nums)));
    //  super(Arrays.stream(nums)
    //  .filter(predicate)
    //  .collect(Collectors.toList()));
    //  this.condition=predicate;
 }

 public conditionArrayList(Predicate<Integer> predicate, ArrayList<Integer> arraylist)  {

    super(arraylist.stream()
    .filter(predicate)
    .collect(Collectors.toList()));
    this.condition=predicate;
}

public conditionArrayList(Predicate<Integer> predicate, List<Integer> list)  {

    super(list.stream()
    .filter(predicate)
    .collect(Collectors.toList()));
    this.condition=predicate;
}


}
