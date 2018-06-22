import java.util.HashMap;
import java.util.Map;

public class GFG
{
    public static void main(String[] args)
    {

        HashMap<String, Integer> map = new HashMap<>();

        print(map);
        map.put("Shankar", 10);
        map.put("Ehsan", 30);
        map.put("Loy", 20);

        System.out.println("Size of map is:- " + map.size());

        print(map);
        if (map.containsKey("Shankar"))
        {
            Integer a = map.get("vishal");
            System.out.println("value for key \"vishal\" is:- " + a);
        }

        map.clear();
        print(map);
    }

    public static void print(Map<String, Integer> map)
    {
        if (map.isEmpty())
        {
            System.out.println("map is empty");
        }

        else
        {
            System.out.println(map);
        }
    }
}