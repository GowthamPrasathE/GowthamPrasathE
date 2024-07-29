package atb6xRestAssuredLearning.RestAssured.Operations.GetRequest;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyle {

	@Test
	public void getRequest() {
		// Given
		RequestSpecification request = RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking/1");

		// When & Then
		Response response = request.when().log().all().get();

		// Validate the response
		response.then().log().all().statusCode(200); // Expecting status code 201
	}

	public class NonBDDStyleNegative {
		
		
		@Description("Verify 404 code is passed when -1 is given")
		@Test
		public void getRequest() {
			RequestSpecification rs = RestAssured.given();
			rs.baseUri("https://restful-booker.herokuapp.com");
			rs.basePath("/booking/-1");

			Response r = rs.when().get();

			r.then().log().all().statusCode(404);

		}

	}
}
