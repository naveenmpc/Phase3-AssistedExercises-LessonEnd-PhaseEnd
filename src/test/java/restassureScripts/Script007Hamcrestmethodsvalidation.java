package restassureScripts;


import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Script007Hamcrestmethodsvalidation {
	
	
	// Hamcrest dependency ahs been added to your POM file
	// This depenedency provides us many validation methods that help us to validate the response code

	// equalTo() Hamcrest method
	@Test(priority='1')
	public void ValidateRepsonseBody()
	{
		String PMapikey = "PMAK-65447e5c30279200381e129f-b50e55ee70c5827b844e17f07bdd6917db";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("workspaces[4].id", equalTo("ece1160b-1dc1-4d10-90f5-c0fdcad4c830"),
			  "workspaces[4].name",equalTo("Myworkspace - Nov 03rd"),
			   "workspaces[4].type",equalTo("personal"));
	}
		@Test(priority='2')
		public void ValidateRepsonseBody_equlaTo()
		{
			
			given().baseUri("https://petstore.swagger.io")
			.basePath("/v2/user/Uname001")
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("username", equalTo("Uname001"),
				  "email", equalTo("Positive@Attitude.com"),
				  "userStatus", equalTo(1));
			
			
		}
	
	
	
	
	@Test(priority='3')
	public void ValidateRepsonseBody_hasitems()
	{
		String PMapikey = "PMAK-65447e5c30279200381e129f-b50e55ee70c5827b844e17f07bdd6917db";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		// fetch the repsonse body and validate if response includes corrrect values or not
		.body("workspaces.name", hasItems("My Workspace","Phase3-Lesson2-APITesting","Myworkspace - Nov 03rd","My workspace - Nov 03rd - new name","Myworkspace - Nov 03rd"),
				"workspaces.type", hasItems("personal"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
