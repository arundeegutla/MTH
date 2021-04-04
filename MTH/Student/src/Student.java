//create a class called Student
public class Student {
   public static void main(String[] args){
    int a = 10, b = 3, t = 0;
    for (int i = 1; i <= 6; i++)
    {
    t = a;
    a = i + b;
    b = t - i;
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(t);

    }
}
