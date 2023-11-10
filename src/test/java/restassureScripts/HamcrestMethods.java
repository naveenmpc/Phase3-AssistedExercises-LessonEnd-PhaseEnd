package restassureScripts;



import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;








public class HamcrestMethods {

	
	
	public void containsMethod() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-65447e5c30279200381e129f-b50e55ee70c5827b844e17f07bdd6917db")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			// matches all the items in the response and in strict order
			// chnage order or remove one item.. method fails
			.body("workspaces.name", contains("My Workspace","Phase3-Lesson2-APITesting","Myworkspace - Nov 03rd","My workspace - Nov 03rd - new name","Myworkspace - Nov 03rd","Myworkspace - Nov 03rd"));
	}
	@Test
		public void projectdemo() {
			int id = given().baseUri("https://petstore.swagger.io/v2/pet/106")
			.when().get()
			.then().body("id", equalTo(106))
			.extract().path("id");
			
System.out.println(id);
			
			
			Assert.assertEquals(106, id);
			
			
		}

	}