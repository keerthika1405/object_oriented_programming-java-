package encapsulation;
//class
public class car {
    //attribite
    String name;
    //private access modifier
    private int License_num;
    private String insurance_num;
    private int Fasttag_code;

    //constuctor
    car(String name,int License_num, String insurance_num, int Fasttag_code){
        this.name=name;
        this.License_num=License_num;
        this.insurance_num=insurance_num;
        this.Fasttag_code=Fasttag_code;
    }

    //assingn  public methods to indirectly  access the private variable  by other class  
    //(using public set and get method )
//get
    public int getlicensenumber(){
        return this.License_num;
    }
    public String getinsurancenumber(){
        return this.insurance_num;
    }
    public int getfastagcode(){
        return this.Fasttag_code;
    }
//set
public void setlicensenumber(int License_num){
     this.License_num=License_num;
}
public void setinsurancenumber(String insurance_num){
     this.insurance_num =insurance_num;
}

    //behavious
    public String checkfasttag(int tag){
    if(tag>0 || tag!=0){
        return "valid number";
    }
    return "not valid number";
    }


}



/*

Access modifiers control the visibility of classes, fields, methods, and constructors. The main access modifiers in Java are:

public: Accessible from any other class.
protected: Accessible within the same package and by subclasses.
default (package-private): Accessible only within the same package.
private: Accessible only within the same class.

non-access modifiers are used to specify other characteristics of classes, methods, and fields. Common non-access modifiers include:

final: Indicates that a variable, method, or class cannot be modified or extended.
static: Indicates that a variable or method belongs to the class rather than instances of the class.
abstract: Indicates that a class or method is incomplete and must be implemented by subclasses.
synchronized: Used with methods or blocks to control the access of multiple threads to shared resources.
transient: Indicates that a variable should not be serialized when an object is persisted.
volatile: Indicates that a variable may be changed by multiple threads.
 */


//benefits of encapsulation
/*
 * prevent classes from becoming tightly coupled
 * easily modify inner working of one class without affecting rest of the program
 * clear path for classes to communicate
 */