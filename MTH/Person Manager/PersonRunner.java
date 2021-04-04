import java.util.Scanner;
public class PersonRunner {
    static String which = "preset";
    static Scanner input = new Scanner(System.in);
    static String bool = "y";
    public static void main(String[] args) {
        System.out.println("Welcome to the Person Manager");
		while(bool.equals("y")){
            create();
            check();
        }
    }
    public static void custOrEmp(){
        if(which.equals("c")){
            print(which);
        } else if(which.equals("e")){
            print(which);            
        } else {
            System.out.print("Error! Entry must be 'c' or 'e'. Try again.");
            create();
        }
    }
    public static void create(){
        System.out.println();
        System.out.print("Create customer or employee? (c/e): ");
        which = input.nextLine();
        custOrEmp();
    }
    public static void check(){
        System.out.println();
        System.out.print("Continue? (y/n): ");
        bool = input.nextLine();
        if(!bool.equals("y")){
            if(!bool.equals("n")){
                System.out.print("Error! Entry must be 'y' or 'n'. Try again.");
                check();
            }
        }
    }
    public static void print(String k){
        System.out.println();
        System.out.print("First Name: ");
        String firstname = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        if(k.equals("c")){
            System.out.print("Customer Number: ");
            String custnum = input.nextLine();
            System.out.println();
            Customer customer = new Customer(firstname, lastName, custnum);
            System.out.println("You entered a new Customer: ");
            System.out.println(customer.toString());
        } else if(k.equals("e")){
            System.out.print("SSN: ");
            String custnum = input.nextLine();
            System.out.println();
            Employee employee = new Employee(firstname, lastName, custnum);
            System.out.println("You entered a new employee: ");
            System.out.println(employee.toString());
        }
    }
}
