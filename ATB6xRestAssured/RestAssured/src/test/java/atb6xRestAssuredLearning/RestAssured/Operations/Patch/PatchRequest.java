package atb6xRestAssuredLearning.RestAssured.Operations.Patch;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PatchRequest {

	String URL = "https://restful-booker.herokuapp.com";
	String basepath = "/booking";
	String token="c6d135b025a15d7";
	String bookingId="2604";
	RequestSpecification r = RestAssured.given();
	Response response;
	ValidatableResponse vr;
	String content = "{\r\n"
			+ "    \"firstname\" : \"James\",\r\n"
			+ "    \"lastname\" : \"Prasath\"\r\n"
			+ "}";
	
	@Test
	public void postRequest() {

		String updatedpath= basepath +"/"+bookingId;

		r.baseUri(URL);
		r.basePath(updatedpath);
		r.contentType(ContentType.JSON);
		r.body(content).log().all();
		r.cookie("token",token);
		
		response = r.when().patch();

		vr = response.then().log().all().statusCode(200);
		vr.body("lastname", Matchers.equalTo("Prasath"));
		
		

	}
	
	
	
	
}
