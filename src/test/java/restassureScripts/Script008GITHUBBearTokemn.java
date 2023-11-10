package restassureScripts;




	import static io.restassured.RestAssured.given;


	import org.testng.annotations.Test;

	import io.restassured.response.Response;


public class Script008GITHUBBearTokemn {
	

		
		@Test(priority='1')
		public void Authorization_bearertoken()
		{
			
		Response res=	given().baseUri("https://api.github.com")
			.basePath("/user/repos")
			.header("Authorization","Bearer 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")
			.when().get()
			.then().statusCode(200)
			.extract().response();
		
			res.prettyPrint();
		}
		
		
		

		
		@Test(priority='2')
		public void Authorization_bearertoken_specificrepo()
		{
			
		Response res=	given().baseUri("https://api.github.com")
			.basePath("/repos/naveenmpc/JavaCodes1")
			.header("Authorization","Bearer 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")
			.when().get()
			.then().statusCode(200)
			.extract().response();
		
			res.prettyPrint();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


