import java.util.*;

public class sorting {
public static void main(String args[])
{
	Map<Integer,Integer>map=new HashMap<Integer,Integer>();
	map.put(1,55);
	map.put(2,54);
	map.put(3,47);
	map.put(4,22);
	List<Integer> li=new ArrayList<>();
	li=getValues(map);
	System.out.println(li);
}
public static List getValues(Map<Integer,Integer> map)
{
	List<Integer> li=new ArrayList(map.values());
	Collections.sort(li);
	return li;
}
}
