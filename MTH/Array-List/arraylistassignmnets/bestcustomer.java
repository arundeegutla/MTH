import java.util.ArrayList;
import java.util.Scanner;
public class bestcustomer {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Double> purchasePriceList= new ArrayList<Double>();
        double pruchasePrice;
        String name = "preset";
		while(!name.equals("done")){
            System.out.println();
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the name of the customer or 'done' to quit: ");
            name = input.nextLine();
            if(!name.equals("done")){
                nameList.add(name);
                System.out.print("Enter the purchase price for the customer "+name+": $");
                pruchasePrice = input.nextDouble();
                purchasePriceList.add(pruchasePrice);
            }
            input.close();
        }
        System.out.println(nameOfBestCustomer(purchasePriceList, nameList));

    }
    
    public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers){
        int index = 0;
        double highestSale = 0;
        for(int i = 0; i < customers.size(); i++){
            if(sales.get(i)>highestSale){
                index = i;
                highestSale = sales.get(i);
            }
        }
        return "The Best Customer today is "+customers.get(index)+" with a purchase of $" + highestSale;
    }
}