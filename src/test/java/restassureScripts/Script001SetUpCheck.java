package restassureScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script001SetUpCheck {
	@Test(enabled=false)
	public void setupCheck()
	{
		Response res = RestAssured.get("https://reqres.in/api/users/2");
		
		System.out.println(res.asString());
		System.out.println(res.getStatusCode());
	}



@Test
public void GetmethodBDDStyle()
{
	RestAssured
	.given()
	.baseUri("https://reqres.in/api/users")
	.queryParam("page", "2")
	.when().get()
	.then()
	.statusCode(200)
	.log().all();
}
}