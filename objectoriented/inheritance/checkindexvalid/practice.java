package checkindexvalid;
// package inheritance;

public class practice {
    public static void main(String[] args) {
        
        modarraylist<Integer> list =new modarraylist<>();
        list.add(0);
        list.add(2);
        list.add(10);
        list.add(20);

System.out.println(list.getUsingMod(1));
System.out.println(list.getUsingMod(-2));
System.out.println(list.getUsingMod(40));

}
}
