public class Customer extends Person {
    public String number;
    public Customer(String first, String last, String number) {
        super(first, last);
        this.number = number;
    }
    public String getCustomerNumber(){
        return number;
    }
    public void setcustomerNumber(String number){
        this.number = number;
    }
    @Override public String toString()
    {
        return (super.toString() + "\nCustomer Number: "+ number);
    }
    
}
