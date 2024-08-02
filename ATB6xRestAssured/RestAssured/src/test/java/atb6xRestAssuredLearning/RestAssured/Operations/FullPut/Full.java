package atb6xRestAssuredLearning.RestAssured.Operations.FullPut;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class Full {

	String Token;
	Integer BookingID;
	RequestSpecification rs = RestAssured.given();
	Response r;
	ValidatableResponse vr;
	@Description("test")
	@BeforeTest
	public void getToken() {
		String payload = "{\r\n" + "    \"username\" : \"admin\",\r\n" + "    \"password\" : \"password123\"\r\n" + "}";
		rs.baseUri("https://restful-booker.herokuapp.com");
		rs.basePath("/auth");
		rs.contentType(ContentType.JSON);
		rs.body(payload).log().all();

		r = rs.when().post();
		vr = r.then();
		vr.statusCode(200);

		// To extract token
		Token = r.then().extract().path("token");
		Assert.assertNotNull(Token);

	}
	@Description("test")
	@BeforeTest
	public void getBookingID() {
		String payload = "{\r\n" + "    \"firstname\" : \"Jim\",\r\n" + "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";
		rs.baseUri("https://restful-booker.herokuapp.com");
		rs.basePath("/booking");
		rs.contentType(ContentType.JSON);
		rs.body(payload).log().all();

		r = rs.when().post();
		vr = r.then();
		String responsestring = r.asString();
		System.out.println(responsestring);
		vr.statusCode(200);
		BookingID = r.then().log().all().extract().path("bookingid");
		System.out.println(BookingID);
		Assert.assertNotNull(BookingID);

	}
	@Description("test")
	@Test
	public void fullput() {
		String payload = "{\r\n" + "    \"firstname\" : \"James\",\r\n" + "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n" + "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n" + "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n" + "    \"additionalneeds\" : \"Breakfast\"\r\n" + "}";
		rs.baseUri("https://restful-booker.herokuapp.com");
		rs.basePath("/booking/" + BookingID);
		rs.contentType(ContentType.JSON);
		rs.body(payload).log().all();
		rs.cookie("token", Token);
		r = rs.when().put();
		vr = r.then().log().all();
		vr.statusCode(200);
		String Firstname = r.then().extract().path("firstname");
		Assert.assertEquals(Firstname, "James");

	}

}
