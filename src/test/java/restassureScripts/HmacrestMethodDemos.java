package restassureScripts;




import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.hasItems;

public class HmacrestMethodDemos {
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
			.body("workspaces.name", hasItems("My Workspace","Phase3-Lesson2-APITesting","Myworkspace - Nov 03rd","My workspace - Nov 03rd - new name","Myworkspace - Nov 03rd"));
	}
}