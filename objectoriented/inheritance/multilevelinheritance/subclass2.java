//analyst subclass

// package inheritance;

public class subclass2 extends parentclass {
    // private String name;
    // private int age;
    // private double salary;

    subclass2(String name,int age,double salary){
        // this.name=name;
        // this.age=age;
        // this.salary=salary;
        super(name,age,salary);
    }

    // public String getname(){
    //     return this.name;
    // }
    // public int getage(){
    //     return this.age;
    // }
    // public double getsalary(){
    //     return this.salary;
    // }
    public double getAnnualBonus(){
        return super.salary * .05;
        // return this.salary * .05; this is also applicable
    }

}
