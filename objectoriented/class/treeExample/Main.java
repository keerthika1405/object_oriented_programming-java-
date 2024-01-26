

public class Main {
 
    public static void main(String[]args){

        //mutiple instances
        tree myfavappletree =new tree(50,5,treetype.apple);
        tree myfavcoconuttree =new tree(120,3,treetype.coconut);
        tree myfavmangotree =new tree(60,5,treetype.mango);


        //instread of writing the same logic for an different input

        // if(myfavappletree.heightoftree >100){
        //     System.out.println("thats a tall "+myfavappletree.treettype+"tree");
        // }
        // if(myfavcoconuttree.heightoftree >100){
        //     System.out.println("thats a tall "+myfavcoconuttree.treettype+"tree");
        // }
          // if(myfavmangotree.heightoftree >100){
        //     System.out.println("thats a tall "+myfavmangotree.treettype+"tree");
        // }



        //try 
         myfavappletree.reusability();
         myfavcoconuttree.reusability();
         myfavmangotree.reusability();

         myfavcoconuttree.grow();

//static
//Static Members : They belong to the class rather than to any specific instance
//Static MethodsThey can be called using the class name and don't have access to instance-specific data.

         System.out.println(tree.trunkcolor);
         tree.accessonlystaticmember();
 //Only one copy of the static variable is created and shared by all instances of the class
 




 
 //Non-Static Members:
 //Instance Variables (Non-Static Variables): These belong to the instance of the class.
 // Each instance of the class has its own copy of instance variables
 //Instance Methods: They are called on an instance of the class.
 //Constructors: Constructors are special instance methods used for initializing objects when they are created.
    }

}
