package files;

public class PayLoad {

	
	
	public static String CoursePrice() {
		return "{\r\n"
				+ " \r\n"
				+ " \"dashboard\":{\r\n"
				+ "   \"purachaseAmount\":910,\r\n"
				+ "   \"website\":\"rahulshettyacademy.com\"\r\n"
				+ " },\r\n"
				+ " \"courses\":[\r\n"
				+ "   \r\n"
				+ "   {\r\n"
				+ "     \"title\":\"Selenium Phython\",\r\n"
				+ "     \"price\":50,\r\n"
				+ "     \"copies\":6\r\n"
				+ "   },\r\n"
				+ "   {\r\n"
				+ "     \"title\":\"cypress\",\r\n"
				+ "     \"price\":40,\r\n"
				+ "     \"copies\":4\r\n"
				+ "   },\r\n"
				+ "   {\r\n"
				+ "     \"title\":\"RPA\",\r\n"
				+ "     \"price\":45,\r\n"
				+ "     \"copies\":10\r\n"
				+ "   }\r\n"
				+ "   \r\n"
				+ "   ]\r\n"
				+ "}";
	}
	
	public static String addBook(String aisle,String isbn) {
		return"{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation With Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}";
	}
	
	
	
	
	
	
	
}
