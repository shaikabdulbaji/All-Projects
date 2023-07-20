package jJsonSchema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class gCreateComplexPayloadUsingMapList {

	public static void main(String[] args) {

		/*
		 [
  {
    "id": 1,
    "first_name": "Padraig",
    "last_name": "Worsnip",
    "email": "pworsnip0@bluehost.com",
    "gender": "Male",
    "mobile": [
      "1212134562",
      "343434434"
    ],
    "skills": {
      "name": "testing",
      "proficiency": "medium"
    }
  },
  {
    "id": 2,
    "first_name": "Tracee",
    "last_name": "Monkhouse",
    "email": "tmonkhouse1@disqus.com",
    "gender": "Polygender",
    "skills": [
      {
        "name": "testing",
        "proficiency": "medium"
      },
      {
        "name": "java",
        "proficiency": "medium",
        "certifications": [
          "ISTQB",
          "OCJP 11",
          "OCJP 12"
        ]
      }
    ]
  }
]
		 */
		
		//To Create JSON Array in java we use List "[" this symbol is list symbol in starting of nested json
		//To store json objects we need Map so we create List<Map<>>
		
		//If we have jsonObject we create "Map"
		//If we have jsonArray create "List"
		
		//Parent JSON Array
		List<Map<String, Object>> finalpayload = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> firstjsonobject = new LinkedHashMap<String, Object>();
		firstjsonobject.put("id", 1);
		firstjsonobject.put("first_name", "Padraig");
		firstjsonobject.put("last_name", "Worsnip");
		firstjsonobject.put("email", "pworsnip0@bluehost.com");
		firstjsonobject.put("gender", "Male");
		
		/*
		List<String> mobilenum = new ArrayList<String>();
		mobilenum.add("1212134562");
		mobilenum.add("343434434");
		// To overcome the above three lines we have one method called "asList()"
		*/
		
		List<String> mobilenum = Arrays.asList("1212134562","343434434");
		
		firstjsonobject.put("mobile", mobilenum);
		
		Map<String, Object> skillset = new LinkedHashMap<String, Object>();
		skillset.put("name", "testing");
		skillset.put("proficiency", "medium");
		
		firstjsonobject.put("skills", skillset);
		
		//If we have 100 words with same name we want to change that name then select that word and rightclick and
		//refactor and rename.
		
		//child payload
		Map<String, Object> secondjsonobject = new LinkedHashMap<String, Object>();
		secondjsonobject.put("id", 2);
		secondjsonobject.put("first_name", "Tracee");
		secondjsonobject.put("last_name", "Monkhouse");
		secondjsonobject.put("email", "tmonkhouse1@disqus.com");
		secondjsonobject.put("gender", "Polygender");
		
		
		List<Map<String, Object>> skilllist = new ArrayList<Map<String, Object>>();
		skilllist.add(skillset);
		
		Map<String, Object> javaskill = new LinkedHashMap<String, Object>();
		javaskill.put("name","java");
		javaskill.put("proficiency", "medium");
		
		List<String> certification = Arrays.asList("ISTQB","OCJP 11");
		
		javaskill.put("certifications", certification);
		
		skilllist.add(javaskill);
		
		secondjsonobject.put("skills", skilllist);
		
		finalpayload.add(firstjsonobject);
		finalpayload.add(secondjsonobject);
		
		RestAssured
		.given()
		.log()
		.all()
		.body(finalpayload)
		.get();
		
	}

}
