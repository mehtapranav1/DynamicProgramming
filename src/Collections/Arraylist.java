package Collections;
import java.util.ArrayList;
import java.util.List;
public class Arraylist {
    public  static void main(String args[]) {
        List<String> n = new ArrayList<>();

        n.add("adam");
        n.add("kevin");
        n.add("joe");
        n.add("jack");
        n.add(2,"Pranav");

        n.remove(0);//method used for removing of value at 0th index
        System.out.println(n.isEmpty());//Method used for checking that weather this list is empty or not and returns boolean type

        for(String s: n){
            System.out.println(s);
        }

    }

}
