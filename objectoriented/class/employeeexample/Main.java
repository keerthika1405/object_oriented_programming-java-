//work
/*
 * creat main class for building employee instances
 * build two employee  instances
 * give one employee a raise
 * display the salary of both employee
 */

package employeeexample;

public class Main {
    public static void main(String[]args){

        employee emp1=new employee("Ram",20,5000,"chennai");
        employee emp2=new employee("seetha",18,5000,"bangalure");

emp2.raiseSalary();

System.out.println(emp1.salary);
System.out.println(emp2.salary);
    }
}
