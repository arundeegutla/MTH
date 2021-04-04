import java.util.*;
class melon {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int m = input.nextInt();
    for (int i = 0; i < m; i++){
      int x = input.nextInt();
      int y = input.nextInt();
      System.out.println((x+y)*2);
    }
  }
}