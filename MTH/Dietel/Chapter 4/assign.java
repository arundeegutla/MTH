import java.util.Scanner;

public class assign
{
    public static void main(String[] args){
      Scanner input = new Scanner( System.in );

      int miles = 0; 
      int gallons = 0; 
      double mpg = 0.0; 
      int total_miles = 0; 
      int total_gallons = 0; 
      double total_mpg = 0.0; 
      int trips = 0;
      System.out.print( "How many trips: ");
      trips = input.nextInt();
      System.out.println();
      
        for(int i = 0; i<trips; i++){
            System.out.print( "Enter trip "+(i+1)+" miles: ");
            miles = input.nextInt();
            System.out.print( "Enter trip "+(i+1)+" gallons: ");
            gallons = input.nextInt(); 

            total_miles += miles; 
            total_gallons += gallons; 
            total_mpg = (double) total_miles / total_gallons;

            mpg = miles / (double)gallons;        
            if((i+1) == 1){
                System.out.printf( "Trip 1 mpg is %.1f\n", mpg );
            } else
            {
                System.out.printf( "\n   Total miles of your "+(i+1)+" trips is %d\n", total_miles );
                System.out.printf( "   Total gallons of your "+(i+1)+" trips is %d\n", total_gallons );
                System.out.printf( "   Combined mpg if your "+(i+1)+" trips is %.1f\n", total_mpg );
            }
            System.out.println();
        }

         System.out.printf( "Total miles driven is: %d\n", total_miles );
         System.out.printf( "Total gallons used is: %d\n", total_gallons );
         System.out.printf( "Total combined mpg is: %.1f\n\n", total_mpg );
         System.out.println();
   }
}