package ijson;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class gJsonPathWithFilters {
	
	public static void main(String[] args) {
		
		String filepath = System.getProperty("user.dir")+"\\src\\test\\java\\json\\gJsonPathWithFiltersfile.json";
		File jsonArrayfile = new File(filepath);
		
		JsonPath jp = new JsonPath(jsonArrayfile);
		
		// for retriving firstname
		System.out.println(jp.getString("[0].firstname"));
		
		//default value of string is "null". if the firstname was not present then it return null.
		List<Object> allfirstnames = jp.getList("firstname");
		System.out.println(allfirstnames);
		
		// Using Filters get list of names
		List<String> femalesfirstnames = jp.getList("findAll{it.sex == 'female'}.firstname");
		System.out.println(femalesfirstnames);
		
		List<String> malesfirstnames = jp.getList("findAll{it.sex != 'female'}.firstname");
		System.out.println(malesfirstnames);
		
		// Using Filters by "&" operator
		String email = jp.getString("find{it.firstname == 'shaik' & it.lastname == 'abdul'}.emailaddress");
		System.out.println(email);
		
		// Using Filters by "|" operator
		List<String> allemail = jp.getList("findAll{it.firstname == 'pat' | it.lastname == 'moulabi'}.emailaddress");
		System.out.println(allemail);
		
		// Using Filters by ">" operator
		System.out.println(jp.getList("findAll{it.id >=5}.emailaddress"));
		
		// Using Filters to  get size()
		System.out.println(jp.getInt("size()"));
		
		
	}

}
