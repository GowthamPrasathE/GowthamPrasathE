package atb6xRestAssuredLearning.RestAssured.Operations.Put;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutRequest {

	String URL = "https://restful-booker.herokuapp.com";
	String basepath = "/booking";
	String token="d276e8703066869";
	String bookingId="2314";
	RequestSpecification r = RestAssured.given();
	Response response;
	ValidatableResponse vr;
	String content = "{\r\n"
			+ "    \"firstname\" : \"James\",\r\n"
			+ "    \"lastname\" : \"Brown\",\r\n"
			+ "    \"totalprice\" : 111,\r\n"
			+ "    \"depositpaid\" : true,\r\n"
			+ "    \"bookingdates\" : {\r\n"
			+ "        \"checkin\" : \"2018-01-01\",\r\n"
			+ "        \"checkout\" : \"2019-01-01\"\r\n"
			+ "    },\r\n"
			+ "    \"additionalneeds\" : \"Break\"\r\n"
			+ "}";
	
	@Test
	public void postRequest() {

		String updatedpath= basepath +"/"+bookingId;

		r.baseUri(URL);
		r.basePath(updatedpath);
		r.contentType(ContentType.JSON);
		r.body(content).log().all();
		r.cookie("token",token);
		
		response = r.when().put();

		vr = response.then().log().all().statusCode(200);
		vr.body("firstname", Matchers.equalTo("James"));
		
		

	}
	
	
	
}
