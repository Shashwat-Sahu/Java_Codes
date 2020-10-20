
import java.util.HashMap;
import java.util.Map;
public class Hashmap {
 public static void main(String args[]) {
	Map <String,Double> map=new HashMap<>();
	map.put("pavan",65.0);
	map.put("shanu",55.0);
	map.put("nitya",75.0);
	map.put("shreshta",85.0);
	map.put("siva",45.0);
//	for(Map.Entry ready:map.entrySet() )
//	{
//		if((Double)ready.getValue()>60)
//			System.out.println((String)ready.getKey()+ ":pass");
//		else
//			System.out.println((String)ready.getKey()+ ":fail");
//			
//	}
	for(String name : map.keySet()) {
		if(map.get(name)>60)
			System.out.println(name+ ":pass");
		else
			System.out.println(name+ ":fail");
	}
 
}
}