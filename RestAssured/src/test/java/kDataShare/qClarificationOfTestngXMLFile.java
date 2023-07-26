package kDataShare;

public class qClarificationOfTestngXMLFile {
	
	/*
	 * If we xml file like below there is no problem it works fine
	 
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite">
	  <test thread-count="5" name="Test">
	    <classes>
	      <class name="kDataShare.oCreateBookingUsingITestContext"/>
	      <class name="kDataShare.pGetBookingDetailsUsingITestContext"/>
	    </classes>
	  </test> <!-- Test -->
	</suite> <!-- Suite -->
	
	
	 
	 * If we xml file like below there is problem it not works fine, in get method it returns "null"
	 
	 <?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
	<suite name="Suite">
	  <test thread-count="5" name="Test">
	    <classes>
	      <class name="kDataShare.oCreateBookingUsingITestContext"/>
	    </classes>
	  </test> <!-- Test -->
	  <test thread-count="5" name="Test">
	    <classes>
	      <class name="kDataShare.pGetBookingDetailsUsingITestContext"/>
	    </classes>
	  </test> <!-- Test -->
	</suite> <!-- Suite -->
	
	* To overcome this we have one method called "getsuite()"
	 
	 */

}
