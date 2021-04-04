import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i<8; i++){
            int adder =  input.nextInt();
            numbers.add(adder);
        }
        /*int val=input.nextInt();
        int index = 0;
        while (val > numList.get(index)){
            index++;
        }
        numList.add(index, val);*/
        //System.out.println(numList.size());
        mystery(numbers);
    }
    public static void mystery(List<Integer> nums){
        for(int k = 0; k<nums.size(); k++){
            if(nums.get(k).intValue() == 0){
                nums.remove(k);
            }
        }
        System.out.println(nums);
    }
}
