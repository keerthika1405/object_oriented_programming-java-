// package inheritance;

public class parentclass extends parentofparentclass {
    // private String name;
    // private int age;
    protected double salary;

    parentclass(String name,int age,double salary){
        // this.name=name;
        // this.age=age;
        super(name,age);
        this.salary=salary;
      
    }

    public double getsalary(){
        return this.salary;
    }

    public void raiseSalary(){
        this.salary=this.salary * 1.2;
    }
}
