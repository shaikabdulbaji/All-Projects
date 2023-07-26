package lPOJOPlainOldJavaObject;

public class dPOJOCompanyHiringPrivateEmployees {

	public static void main(String[] args) {

		cPrivateEmployeePojoExample shaik = new cPrivateEmployeePojoExample();
		shaik.setId(10);
		shaik.setName("abdul"); 
		shaik.setMobno("123456789");
		shaik.setGender("male");
		shaik.setDepartid(100);
		shaik.setAddress("gnt");
				
	    cPrivateEmployeePojoExample abdul = new cPrivateEmployeePojoExample();
	    abdul.setId(10);
	    abdul.setName("shaik"); 
	    abdul.setMobno("1234567890");
	    abdul.setGender("male");
	    abdul.setDepartid(101);
	    abdul.setAddress("gnt1");
	    
	    System.out.println(shaik.getAddress());
	    System.out.println(abdul.getGender());
		
	    /*
	     *  POJO is again a normal java class, which should not have any restrictions and it is a way
	        like how well you are structuring your data. 
	        eg :- we have variables as private we can access it by using "getter and setter" methods
	     *  Here shaik and abdul are java objects
	     */
		
	}

}
