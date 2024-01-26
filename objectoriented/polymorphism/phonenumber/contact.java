package phonenumber;
public class contact {
    private String name;
    private phonenumber phonenumber;
    private String emailaddress;

    public contact(String name,phonenumber phonenumber,String emailaddress){
        this.name=name;
        this.phonenumber=phonenumber;
        this.emailaddress=emailaddress;
    }

    public contact(String name,phonenumber phonenumber){
        this.name=name;
        this.phonenumber=phonenumber;
    }
    public contact(String name,String emailaddress){
        this.name=name; 
        this.emailaddress=emailaddress; 
    }
@Override
    public String toString(){
        return"contact{ " +
        "name='" +name+ '\"'+
        ",phonenumber="+phonenumber +
        "emailAddress='"+emailaddress+'\"'+
        '}';
    } 
}
