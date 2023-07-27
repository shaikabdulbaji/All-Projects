package nJSONtoPOJO_Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nJSONtoPOJO_Jackson.nBook;

public class oJsonPropertyExample {

	public static void main(String[] args) throws JsonProcessingException {

		
		nBook book = new nBook();
		book.setBookName("Shaik Abdul");
		book.setAuthorName("Abdul Baji");
		
		// Converted from Java Object to JSON Object
		ObjectMapper obmap = new ObjectMapper();
		String bookjsonobject = obmap.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		System.out.println(bookjsonobject);
		
		// Converted from JSON Object to Java Object
		nBook b1 = obmap.readValue(bookjsonobject, nBook.class);
		System.out.println(b1.getBookName());
		System.out.println(b1.getAuthorName());
		
	}

}
