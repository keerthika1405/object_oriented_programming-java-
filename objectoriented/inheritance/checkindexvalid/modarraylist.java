package checkindexvalid;
// package inheritance;

import java.util.ArrayList;

public class modarraylist<D> extends  ArrayList<D>{

    public D getUsingMod(int index){
        int validindex =Math.abs(index) % this.size();
        return this.get(validindex);
    }
}
