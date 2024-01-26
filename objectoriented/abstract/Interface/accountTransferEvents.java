package Interface;
public class accountTransferEvents extends abstractEvents {

    accountTransferEvents(String id){
super(id);   
 }

    @Override
    public void process(){
        System.out.println("customer "+id+"need to transfer their service"+
        " reaching out to CTE to remove service from old device and add service to new device");
    }
}
