import java.util.*;
import java.util.Map.Entry;
class Sortbyname implements Comparator<String>
{ 
    // Used for sorting in ascending order of 
    // roll name 
    public int compare(String o1, String o2) 
    { 
        return o1.compareTo(o2); 
    } 
} 
  
public class doselect_lab7_1 {
    
    public static void getMethod(LinkedHashMap<String,String>  map)
    {
        
    List keys = new ArrayList<String>(map.keySet());
    List values = new ArrayList<String>(map.values()); 
        
    Collections.sort(values,new Sortbyname());
    LinkedHashMap<String,String> sortedMap = new LinkedHashMap<String,String>();
    for(int i=0;i<values.size();i++)
    for(Entry<String,String> entry: map.entrySet())
    {
        if(Objects.equals(values.get(i), entry.getValue()))
        sortedMap.put(entry.getKey(), entry.getValue());
    }
    for(Entry<String,String> entry: sortedMap.entrySet())
    {
        System.out.println(entry.getKey()+" "+entry.getValue());
    }
    }
    
    public static void main(String[] args) {
        LinkedHashMap<String,String> m = new LinkedHashMap<String,String>();
        m.put("India", "New Delhi");
        m.put("Japan", "Tokya");
        m.put("USA", "Washington DC");
        m.put("England", "London");
        m.put("France","Paris");
        getMethod(m);
    }
}
