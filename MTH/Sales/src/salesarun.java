/**
 * salesarun
 */
import java.text.NumberFormat;
import java.util.Locale;
public class salesarun {
    public static void main(String[] args) 
	{
        NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
        double[][] salesArr = {
            {1540.0, 2010.0, 2450.0, 1845.0},
            {1130.0, 1168.0, 1847.0, 1491.0},
            {1580.0, 2305.0, 2710.0, 1284.0},
            {1105.0, 4102.0, 2391.0, 1576.0}
        };
        System.out.println();
        System.out.println("The Sales Report application");
        System.out.println();
        //Everything
        System.out.printf("Region\t\tQ1\t\tQ2\t\tQ3\t\tQ4\n");
        for(int region = 0; region<4; region++){
            System.out.print(region+1+"\t\t");
            for(int quarter = 0; quarter<4; quarter++){
                System.out.printf("$"+nf.format(salesArr[region][quarter])+"\t\t");
            }
            System.out.println();
        }
        System.out.println();

        //By region
        System.out.println("Sales by region:");
        for(int i = 0; i<4; i++){
            System.out.print("Region "+(i+1)+": ");
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum += salesArr[i][j];
            } 
            System.out.println("$"+nf.format(sum));
        }
        System.out.println();

        //By quarter
        System.out.println("Sales by quarter:");
        for(int i = 0; i<4; i++){
            System.out.print("Q"+(i+1)+": ");
            int sum = 0;
            for(int j = 0; j < 4; j++){
                sum += salesArr[j][i];
            } 
            System.out.println("$"+nf.format(sum));
        }
        System.out.println();

        //Total
        int sum1 = 0;
        for (double[] arr : salesArr){
            for(double i: arr){
                sum1+=i;
            }
        }
        System.out.println("Total Sales: " + "$"+nf.format(sum1));
        System.out.println();
        
	}
}