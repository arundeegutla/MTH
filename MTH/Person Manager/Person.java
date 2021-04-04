public class Person {

    public String firstName, lastName;
    
    public Person(String first, String last){
        firstName = first;
        lastName = last;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String first){
        firstName = first;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String last){
        lastName = last;
    }
    public String toString(){
        return "Name: " + firstName + " " + lastName;
    }
    
}