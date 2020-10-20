	import java.util.*;
	public class ArrayList4 {
	public static void main()
	{
		List<Integer>values=new ArrayList<Integer>();
		values.add(3);
		values.add(0,8);
		values.add(4);
		for(Integer i:values) {
		System.out.println(values);
	}
		values.set(0,9);
		System.out.println(values);
	}
	}

