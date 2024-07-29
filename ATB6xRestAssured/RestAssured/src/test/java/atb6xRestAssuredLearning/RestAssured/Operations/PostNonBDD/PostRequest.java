package atb6xRestAssuredLearning.RestAssured.Operations.PostNonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	String URL = "https://restful-booker.herokuapp.com";
	String basepath = "/booking";

	RequestSpecification r = RestAssured.given();
	Response response;
	ValidatableResponse vr;
	
	@Test
	public void postRequest() {

		String content = "{\r\n" + "    \"firstname\" : \"Jim\",\r\n" + "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";

		r.baseUri(URL);
		r.basePath(basepath);
		r.contentType(ContentType.JSON);

		r.body(content).log().all();

		response = r.when().post();
		String responseString = response.asString();
		System.out.println(responseString);

		vr = response.then().statusCode(200);
		
		

	}

}
