package kDataShare;

import java.util.LinkedHashMap;

public class eDatastoreAsMap {
	
	private eDatastoreAsMap() {};
	// We created the Constructor because no one will create the Object
	
	private static LinkedHashMap<String, Object> dataMap = new LinkedHashMap<String, Object>();
	// We created on private mapp because no one can access from out side
	
	public static void setValue(String key, Object value)
	{
		dataMap.put(key, value);
	}
	
	public static Object getValue(String key)
	{
		return dataMap.get(key);
	}
	
	   /*
	   By using above Map method also it will create problem all team members are working with different
	   methods it's leads to problem in future
	   
	   To overcome this we go to ennum method or interface method
	   */

}
