package restassureScripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script003PostMethod {
@Test
public void postmethod()
{
	//this is payload sending with request to server.
	//creating payload on web server using payload methd called post.
	HashMap<String,String>map = new HashMap<String, String>();
	map.put("name", "John");
	map.put("Job", "Tester");
	
	RestAssured.
	given().baseUri("https://reqres.in/")
	.basePath("/api/users")
	.contentType("application/json")
	.body(map)
	.when().post()
	.then().statusCode(201)
	.log().all();
}
}
