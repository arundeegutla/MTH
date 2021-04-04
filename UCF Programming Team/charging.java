import java.util.*;
class charging {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    for (int i =0; i<n; i++){
      int c = input.nextInt();
      int remaining = 100 - c;
      System.out.println(remaining);
    }
  }
}