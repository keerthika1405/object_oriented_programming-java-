//salesperson subclass

// package inheritance;

public class subclass1 extends parentclass{
    // private String name;
    // private int age;
    // private double salary;
    private double commissionpercent; 


subclass1(String name,int age,double salary, double commissionpercent){
    // this.name=name;
    // this.age=age;
    // this.salary=salary;
    super(name,age,salary);
    this.commissionpercent= commissionpercent;
}

    // public String getname(){
    // return this.name;
    // }
    // public int getage(){
    // return this.age;
    // }
    // public double getsalary(){
    // return this.salary;
    // }
    // public void raiseSalary(){
    //     this.salary=this.salary * 1.2;
    // }
    public double getcommissionpercent(){
    return this.commissionpercent;
    }

    public void raisecommission(){
        if(this.commissionpercent < .30){
            this.commissionpercent =this.commissionpercent * 1.2;
        }
    }
}