package ijson;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class gJsonPathWithFilters1 {
	
	public static void main(String[] args) {
		
		String filepath = System.getProperty("user.dir")+"\\src\\test\\java\\json\\gJsonPathWithFiltersfile1.json";
		File jsonArrayfile = new File(filepath);
		
		JsonPath jp = new JsonPath(jsonArrayfile);
		
		// for retriving firstname
		System.out.println(jp.getString("data[0].firstname"));
		
		// Using Filters get list of names
		List<String> femalesfirstnames = jp.getList("data.findAll{it.sex == 'female'}.firstname");
		System.out.println(femalesfirstnames);
		
		
	}

}
