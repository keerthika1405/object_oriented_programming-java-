package encapsulation;

public class bankmain {
    public static void main(String[]args){

    bankaccount customer=new bankaccount("ABC", 1000);

    customer.withdraw(5000);
    
    customer.deposit(10000);

    System.out.println(customer.getOwner());
    System.out.println(customer.getBalance());


    }
}
