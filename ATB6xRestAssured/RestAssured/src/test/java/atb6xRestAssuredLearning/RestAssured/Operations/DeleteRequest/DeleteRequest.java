package atb6xRestAssuredLearning.RestAssured.Operations.DeleteRequest;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteRequest {
	
	String URL = "https://restful-booker.herokuapp.com";
	String basepath = "/booking";
	String token="c6d135b025a15d7";
	String bookingId="2604";
	RequestSpecification r = RestAssured.given();
	Response response;
	ValidatableResponse vr;
	
@Description("Test 1")
	@Test
	public void postRequest() {

		String updatedpath= basepath +"/"+bookingId;

		r.baseUri(URL);
		r.basePath(updatedpath);
		r.contentType(ContentType.JSON);
		
		r.cookie("token",token);
		
		response = r.when().delete();

		vr = response.then().log().all().statusCode(201);
		
		
		

	}
	
	
	
}
