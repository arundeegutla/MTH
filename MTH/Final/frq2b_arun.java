/** @param start starting point for values to be checked
 * Precondition: start > 0
 * @param num the size of the array to be returned
 * Precondition: num 0 >
 * @return an array containing the first num integers ≥ start that are self-divisors
 */
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