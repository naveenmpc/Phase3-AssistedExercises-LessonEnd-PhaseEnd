package restassureScripts;



import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LogMethodss {
	
	
	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-65447e5c30279200381e129f-b50e55ee70c5827b844e17f07bdd6917db";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}

}
