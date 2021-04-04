public class chapter {
    public static void main(String[] args){
       double number;
       double factorial;
       System.out.println("Number          Factorial");
          for ( int i = 1; i <= 20; i++ ){
             number = i;
             factorial = number;
             for ( int j = (int)(number-1); j >=1; j-- ){
                factorial *= j;
             }
             if (number<10)
                System.out.println((int)number + "               " +  (int)factorial);
             else
                System.out.println((int)number + "              " +  factorial);
          }
       }
    }
    