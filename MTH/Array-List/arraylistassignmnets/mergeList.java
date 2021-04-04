import java.util.ArrayList;
public class mergeList {
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

        System.out.println(merge(studentids, teachersids));
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> newList = new ArrayList<Integer>();
    
        while(i < a.size() || j < b.size()) {
            if(i < a.size()){
                newList.add((Integer) a.get(i++));
            }
            if(j < b.size()){
                newList.add((Integer) b.get(j++));
            }
        }
        return newList;
    }
}
