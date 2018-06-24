package Collections;
import sun.awt.geom.AreaOp;

import javax.xml.soap.SOAPPart;
import java.util.LinkedList;
import java.util.List;
public class Lnklst {
    public static void main(String[] args) {
        List<Integer> list = new  LinkedList<>();
        list.add(3);
        list.add(33);
        list.add(333);
        list.add(0,22);
        list.remove(0);

        for(Integer s: list)
        {
            System.out.println(s);
        }



    }
}
