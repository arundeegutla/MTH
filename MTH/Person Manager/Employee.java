public class Employee extends Person {

    public String ssn;
    public Employee(String first, String last, String ssn) {
        super(first, last);
        this.ssn = ssn;
    }
    public String getSsn(){
        return ssn;
    }
    public void setSsn(String ssn){
        this.ssn = ssn;
    }
    @Override public String toString()
    {
        return (super.toString() + "\nSSN: "+"xxx-xx-" +ssn.substring(ssn.length()-4, ssn.length()));
    }
    
}
