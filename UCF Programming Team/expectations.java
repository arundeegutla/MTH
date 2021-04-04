import java.util.*; 
class expectations {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    for(int i = 0; i<t+1; i++){
      String n = input.nextLine();
      int check = 0;
      
      for(int j = 2; j < n.length()-1; j++){
        if(!n.substring(j,j+1).equals(" ")){
          int x;
          int y;
        
          if(!n.substring(j+1,j+2).equals(" ")){
            x = Integer.parseInt(n.substring(j,j+2));
            y = Integer.parseInt(n.substring(j+3,j+4));
            if(x+1>y){
              check += (x+1) - y;
            }
          }else{
            x = Integer.parseInt(n.substring(j,j+1));
            y = Integer.parseInt(n.substring(j+2,j+3));
            if(x+1>y){
              check += (x+1) - y;
            }
          }
        }
      }
      System.out.println(check);
    }
  }
}

// What are you doing GO TO WORK!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!