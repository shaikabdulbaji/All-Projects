package lPOJOPlainOldJavaObject;

public class bPOJOCompanyHiringPublicEmployees {

	public static void main(String[] args) {

		aPublicEmployeePojoExample shaik = new aPublicEmployeePojoExample();
		shaik.id = 10;
		shaik.name = "abdul";
		shaik.mobno = "123456789";
		shaik.gender = "male";
		shaik.departid = 100;
		shaik.address ="gnt";
		
		aPublicEmployeePojoExample abdul = new aPublicEmployeePojoExample();
		abdul.id = 20;
		abdul.name = "sshaik";
		abdul.mobno = "1234567890";
		abdul.gender = "male";
		abdul.departid = 101;
		abdul.address ="gnt1";
		
		System.out.println(shaik.id);
		System.out.println(abdul.address);
		
		// If we have 1000 employees we can creat object and call that employees details.
		// we have one problem the employee details are here public we want to put it as private
		// why because employee salary and gender etc.. are confedential.
		
	}

}
