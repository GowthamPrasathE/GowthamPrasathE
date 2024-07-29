package atb6xRestAssuredLearning.RestAssured.Operations.GetRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest {

	@Test
	public void getrequest() {
		// TODO Auto-generated method stub
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com").basePath("/booking/-1")
		.when().log().all().get()
		.then()	
		.statusCode(201);

	}
}
