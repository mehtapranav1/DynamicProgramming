/**HashMap is a part of collection in Java since 1.2. It provides the basic implementation of Map interface of Java.
It stores the data in (Key, Value) pairs. To access a value you must know its key, otherwise, you can’t access it.
HashMap is kept in java.util package. As you can see in above definition of HashMap, it extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface
Syntax:
HashMap<String, Integer> map = new HashMap<>(); // Syntax for creating hash map

Some of methods of HashMap

1)put(): java.util.HashMap.put() plays role in associating the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced.
Syntax:

public V put(K key,V value)

2)get(): java.util.HashMap.get()method returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
Syntax:

public V get(Object key)

3) isEmpty(): java.util.HashMap.isEmpty() method returns true if the map contains no key-value mappings.
Syntax:

public boolean isEmpty()

4)size(): java.util.HashMap.size() returns the number of key-value mappings in this map.
Syntax:
public int size()*/
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
            Integer a = map.get("Shankar");
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
