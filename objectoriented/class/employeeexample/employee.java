package employeeexample;

//class
public class employee {
    //attributes
    String name ;
    int age;
    double salary;
    String location;

    //constructor
employee(String name , int age,double salary,String location){
    this.name=name;
    this.age=age;
    this.salary=salary;
    this.location=location;

}
    //behaviour
    void raiseSalary(){
this.salary=this.salary * 1.3;
    }
}
