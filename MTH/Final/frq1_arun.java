/** @param number the number to be tested
 * Precondition: number 0 >
 * @return true if every decimal digit of number is a divisor of number;
 * false otherwise
 */
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