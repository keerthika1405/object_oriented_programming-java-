import java.awt.Color;
//class
public class tree{

    //Attributes and Nonstatic memeber
    int heightoftree;
    int diameteroftrunk;
    treetype treettype;
    //Static memeber
    static  Color trunkcolor = new Color(102,51,0);



    //constructor 
    /*
    a constructor is a special method that is automatically called
    constructors do not have a return type. 
     when an object of a class is created. Its primary purpose is to initialize the object's attributes
     Unlike methods, constructors are not called explicitly; they are invoked automatically when an object is created using the new keyword.
    */
    tree(int heightoftree, int diameteroftrunk,treetype treettype){
        this.heightoftree = heightoftree;
        this.diameteroftrunk =   diameteroftrunk;
        this.treettype =treettype;
    }
    



    //behaviour
    void grow(){
        this.heightoftree =this.heightoftree+10;
        this.diameteroftrunk =this.diameteroftrunk+1;
        System.out.println("after adding 10 meter for  "+ this.treettype+" tree, the height is "+this.heightoftree+" meter");
    }

    //we can define a series of attributes and behaviour that are re-usable
   // with help of
     /* 
        ------>"this" keyword
        it is a reference variable that refers to the current object.
         It is commonly used to disambiguate between instance variables and parameters with the same name.
     */

    void reusability(){
        if(this.heightoftree > 100){
                System.out.println("the given tall tree is "+this.treettype+" tree");
        }
    }

    //static behaviour or method
    static void accessonlystaticmember(){
    // System.out.println("try to get the non_static member"+this.treetype);//error ,because you can't access nonstatic member in static methods
    System.out.println("try to get the static member trunkcolor  "+tree.trunkcolor);

    
    }


}