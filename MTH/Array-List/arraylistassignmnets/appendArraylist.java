import java.util.ArrayList;
public class appendArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> studentids = new ArrayList<Integer>();
        studentids.add(1);
        studentids.add(5);
        studentids.add(9);
        studentids.add(6);
        
        ArrayList<Integer> teachersids = new ArrayList<Integer>();
        teachersids.add(8);
        teachersids.add(90);
        teachersids.add(60);
        teachersids.add(20);
        teachersids.add(100);

        System.out.println(append(studentids, teachersids));
    }
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.addAll(a);
        newList.addAll(b);
        return newList;   
    }
}

