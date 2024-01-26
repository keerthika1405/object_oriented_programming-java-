/*
 * create a  class practice that make bankaccounts instances
 * withdraw a certain ammount using withdraw methode
 * printout the result balances
 */

package encapsulation;

public class practice {
 
    public static void main(String[]args){
        car person1=new car("suv",123,"ABC123",1);
        car person2=new car("wagon",345,"CDE345",2);

//this will throw an error because you are try to accessing private varaible of car class from main class
        // System.out.println(person1.License_num);
        // System.out.println(person2.insurance_num);
        // System.out.println(person1.Fasttag_code);


        //solution to  indirectly access the private variable
        //get 
        person1.getlicensenumber();
        person2.getinsurancenumber();
        person1.getfastagcode();

        //set
        person1.setinsurancenumber("ABC213");
        person2.setlicensenumber(001);
    }
}