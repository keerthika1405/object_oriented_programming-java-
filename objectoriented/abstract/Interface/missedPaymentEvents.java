package Interface;
public class missedPaymentEvents extends abstractEvents{

    missedPaymentEvents(String id){
        super(id); 
    }

        @Override
        public void process(){
            System.out.println("customer "+id+" missed their paymaent sending bill to the customer");
        }
}
