/*To avoid rewritting code  you can use inheritance
add common behaviour to parent class and 
 with help of super keyword you  can access attribbute of parent 
 with help of extends keyword you can use parents methods


*/
public class Main {
    public static void main(String[]args){

        parentofparentclass head=new parentofparentclass("abc", 25);
        System.out.println(head.getname());

        parentclass head2=new parentclass("abc",25,2000);
        System.out.println(head2.getsalary());
        head2.raiseSalary();
        System.out.println("after salary increment "+head2.getsalary());
        System.out.println("after salary increment "+head2.getname());

        subclass1 child1 =new subclass1("ram", 10, 3000, 0.2);
        System.out.println(child1.getcommissionpercent());
        System.out.println(child1.getname());
      

        subclass2 child2 =new subclass2("ram", 10, 3000);
        System.out.println(child2.getAnnualBonus());
    }
}
