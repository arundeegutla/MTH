import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println(word.substring(1, 2));
        int[] array = firstNumSelfDivisors(10,2);
        System.out.println(Arrays.toString(array));
        //isSelfDivisor(26);
        //scrambleWord("SATHWIKA");
    }
    public static boolean isSelfDivisor(int number){
     int thisNumber = number;
     int currentNumber = 0;
     while (thisNumber > 0){
        currentNumber = thisNumber % 10;
        if (currentNumber == 0 || number % currentNumber != 0){
            return false;
        }
        thisNumber = thisNumber/10;
     }
     return true;
   }
   public static int[] firstNumSelfDivisors(int start, int num){
       int[] selfDivisors = new int[num];
       int times = 0;
       while(times != num){
           if(isSelfDivisor(start)){
               selfDivisors[times] = start;
               times++;
           }
           start++;
       }
       return selfDivisors;
   }
}

