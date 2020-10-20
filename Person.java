import java.util.*;
public class Person {
    public static Map<Integer,String> directory()
    {
   Map<Integer,String>map=new TreeMap<Integer,String>();
   map.put(9685746,"SAMIK");
   map.put(657980,"Ridhima");
   map.put(987654,"Shiva");
   return map;
    }
    public static void main(String[] args) {
        Map<Integer,String>map=new TreeMap<Integer,String>();
        map = directory();
        for(Integer mob: map.keySet())
        {
            System.out.println(Integer.toString(mob) + ":" + map.get(mob));
        }
    }
}
