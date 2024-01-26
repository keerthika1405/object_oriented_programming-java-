package encapsulation;

import java.lang.Math;
public class bankaccount {

    //attributes
    private String ownername;
    private Double balance;

    //functionality
    /*
     *constructor
     * deposit
     * withdrawal
     * getter methods
     */

     //constuctor
    bankaccount(String ownername,int startingbalance){
        this.ownername=ownername;
        this.balance= (double) Math.max(startingbalance,0);
    }


    //deposite
    public double deposit(int amount){
        if (amount >0){
            this.balance=this.balance+amount;
            return amount;
        }
        return 0;

    }

    //withdraw
    public double withdraw(int amount){
        if(amount <=this.balance){
            this.balance=this.balance-amount;
            return amount;
        }
        return 0;
    }

    //getter
    public String getOwner(){
        return this.ownername;
    }
    public Double getBalance(){
        return this.balance;
    }


}
