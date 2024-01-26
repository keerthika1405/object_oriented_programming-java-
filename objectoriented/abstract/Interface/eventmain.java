package Interface;
public class eventmain {
    public static void main(String[] args) {
        passwordChangeEvents eventOne=new passwordChangeEvents("45678");
        missedPaymentEvents eventTwo= new missedPaymentEvents("12345");
        accountTransferEvents eventThree=new accountTransferEvents("67890");
    
        events[] events={eventOne,eventTwo,eventThree}; 
        for(events e: events){
            System.out.println(e.gettimestamp());
        e.process();
        System.out.println();
        }
    }
}
