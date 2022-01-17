package samplerestapi;

import files.PayLoad;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		
		JsonPath jsp=new JsonPath(PayLoad.CoursePrice());
		//print no of courses returned  by api
		int courtses=jsp.getInt("courses.size()");
		
		System.out.println(jsp.getInt("courses.size()"));
		//print purchase amount
		//int totalAmount=jsp.getInt("dashboard.purchaseAmount");
		//System.out.println(totalAmount);
		
		//print title of the first course
		//String titleFirstcourse=jsp.get("courses[0].title");
		//System.out.println(titleFirstcourse);
		
		//print all the courses titles and their respective prices
		/*for(int i=0;i<=courtses;i++) {
			String coursetitle=jsp.get("courses["+i+"].title");
			int coursePrice=jsp.getInt("courses["+i+"].price");
			System.out.println(coursetitle);
			System.out.println(coursePrice);
		}*/
		
		
		
		System.out.println("Print no of copies sold by RPA Course");
		
		for (int i = 0; i <=courtses; i++) {
			String coursetitle=jsp.get("courses["+i+"].title");
			if(coursetitle.equalsIgnoreCase("cypress")) {
				int copies=jsp.getInt("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
		}
		
		
	}
	
	
	
}
