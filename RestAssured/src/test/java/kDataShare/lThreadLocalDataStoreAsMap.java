package kDataShare;

import java.util.LinkedHashMap;

public class lThreadLocalDataStoreAsMap {

		private lThreadLocalDataStoreAsMap() {};
		// We created the Constructor because no one will create the Object
		
		private static LinkedHashMap<String, Object> dataMap1 = new LinkedHashMap<String, Object>();
		// We created on private mapp because no one can access from out side
		
		private static ThreadLocal<LinkedHashMap<String, Object>>  dataMap = 
				ThreadLocal.withInitial(() -> new LinkedHashMap<String, Object>());
		
		public static void setValue(String key, Object value)
		{
			dataMap.get().put(key, value);
		}
		
		public static Object getValue(String key)
		{
			return dataMap.get().get(key);
		}
	

}
