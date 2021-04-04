/** @param start starting point for values to be checked
 * Precondition: start > 0
 * @param num the size of the array to be returned
 * Precondition: num 0 >
 * @return an array containing the first num integers ≥ start that are self-divisors
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