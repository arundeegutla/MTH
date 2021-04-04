import java.util.*;
class test {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    for(int i = 0; i < t; i++){
        int n = input.nextInt();
        //ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] arr = new int[n];
        for(int j = 0; j < n; j++){
            int y = input.nextInt();
            arr[j] = y;
            System.out.println(arr[j]);
        }


        //check the difference 
        int count = 0;
        //int min = arr[0];
        int diff;
        int newVal;
        int min;

        for(int k = 1; k < n; k++){
            if(arr[k] <= arr[k-1]){
                min = arr[k-1];
                newVal = min + 1;
                diff = newVal - arr[k];
                count += diff;
                arr[k] += diff;
            }
        }

    
        System.out.println(count);
    }
  }
}
