package Interface;
import java.sql.Timestamp;

public abstract class abstractEvents implements events{

    private final Long creadtedTimeStamp;
    protected final String id;

    abstractEvents(String id){
    this.id=id;
    this.creadtedTimeStamp=new Timestamp(System.currentTimeMillis()).getTime();
    }

    @Override
    public Long gettimestamp(){ return  this.creadtedTimeStamp; }
    public abstract  void process();

}
