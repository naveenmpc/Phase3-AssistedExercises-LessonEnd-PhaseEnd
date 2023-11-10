package restassureScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class Script004PayLoad {
@Test
	public void postusingJSON()
	{
		JSONObject body = new JSONObject();
		body.put("name", "MyLifedan");
		body.put("salary", "45678");
		body.put("age","23");
		
	    RestAssured.given()
	    .baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType("application/json")
		.body(body.toString())
		.when().post("/create")
		.then()
		.statusCode(200)
		.log().all();
	}
}
