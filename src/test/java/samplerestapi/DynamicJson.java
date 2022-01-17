package samplerestapi;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.PayLoad;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class DynamicJson {

	@Test(dataProvider = "BooksData")
	public void addBook(String isbn,String asble) {
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().header("Content-Type","application/json")
		.body(PayLoad.addBook(isbn,asble))
		.when()
		.post("/Library/Addbook.php")
		.then().log().all()
		.assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath jsp=ResusableMethods.rawToJson(response);
		String id=jsp.getString("ID");
		System.out.println(id);
		//delete book
		
		
		
		
	}
	
	
	@Test
	public void Deletebook() {
		RestAssured.baseURI="http://216.10.245.166";
		given().when().delete("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200);
		
	}
	
	
	@DataProvider(name="BooksData")
	public Object[][] getData(){
	return new Object[][] {{"selenium","499"},{"mysql","229"},{"appium","545"}};
	}
	
}
