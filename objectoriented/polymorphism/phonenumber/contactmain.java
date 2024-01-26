package phonenumber;
//ccreate contact with different information

public class contactmain {
    public static void main(String[] args) {
        contact contactone=new contact("ABC",new phonenumber("123456789"),"abc@gmail.com");
        contact contacttwo=new contact("ABC",new phonenumber("123456789"));
        contact contactthree=new contact("ABC",new phonenumber(91,"123456789"));
        contact contactfour=new contact("ABC","abc@gmail.com");
        
        System.out.println(contactone);
        System.out.println(contacttwo);
        System.out.println(contactthree);
        System.out.println(contactfour);
        

    }
}
