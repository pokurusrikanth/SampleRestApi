package samplerestapi;

import org.testng.annotations.Test;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class SumValidation {

	
	
	@Test
	public void sumvalidation() {
		
		
		JsonPath jsp=new JsonPath(PayLoad.CoursePrice());
		
		int count=jsp.getInt("courses.size()");
		int sum=0;
		for (int i = 0; i <=count; i++) {
			int price=jsp.getInt("courses["+i+"].price()");
			int copies=jsp.getInt("courses["+i+"].copies");
			int amount=price * copies;
			System.out.println(amount);
			sum=sum+amount;
		}
		
		
	}
	
	
	
	
	
	
}
