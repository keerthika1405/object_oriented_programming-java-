package Interface;
public class passwordChangeEvents extends abstractEvents{

    passwordChangeEvents(String id){
        super(id); 
    }
 
        @Override
        public void process(){
    System.out.println("customer "+id+" change their password sending a confrimation email to the customer");
        }
}
