import java.util.*;
class worse {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] worse = new String [] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}; 
    int m = input.nextInt();
    for(int i = 0; i < m+1; i++){
      String line = input.nextLine();
      String end = "";
      int num = 0;
      for(int j = 0; j < line.length(); j++){
        if(line.substring(j,j+1).equals(" ")){
          end += worse[num-1];
          num = 0;
        }
        if(line.substring(j,j+1).equals("*")){
          num++;
        }
        if(j == line.length()-1){
          end += worse[num-1];
        }
      }
      System.out.println(end);
      end = "";
    }
    
  }
}