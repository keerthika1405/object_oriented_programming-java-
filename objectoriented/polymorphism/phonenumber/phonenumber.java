package phonenumber;
public class phonenumber {
    private int countrycode;
    private String phonenumber;

    public phonenumber(String  phonenumber){
if(phonenumber.length()>10){
    this.countrycode=Integer.parseInt(phonenumber
    .substring(0, phonenumber.length()-10));
    this.phonenumber=phonenumber
    .substring(0, phonenumber.length()-10);
}
else{
    this.countrycode=91;
    this.phonenumber=phonenumber;
}
    }

    public phonenumber(int countrycode,String phonenumber){
        this.countrycode=countrycode;
        this.phonenumber=phonenumber;
    }

    @Override
    public String  toString(){
        return"phonenumber{ " +
        "countrycode='" +countrycode+ '\"'+
        ",phonenumber="+phonenumber +
        '}';
    }
}
