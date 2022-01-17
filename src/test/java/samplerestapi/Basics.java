package samplerestapi;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
public class Basics {

	
	public static void main(String[] args) {
		
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response=given().log().all()
		.queryParam("key", "quick123")
		.header("Content-type","application/json")
		.body("")
		.when()
		.post("maps/api/place/add/json")
		.then()
		.assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18(Ubuntu)").extract().response().asString()
		;
		
		JsonPath jsp=new JsonPath(response);
		String placeid=jsp.getString("place_id");
		System.out.println(placeid);
		
		//using update
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("")
		.when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Adress successfully updated"));
	
		
		//get place
		String getPlaceResponce=given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", placeid)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().extract().response().asString();
		JsonPath jp=new JsonPath(getPlaceResponce);
		String actualadress=jp.getString("adress");
		
		Assert.assertEquals(actualadress,"");
		
		
	}
	
	
	
	
	
	
}
