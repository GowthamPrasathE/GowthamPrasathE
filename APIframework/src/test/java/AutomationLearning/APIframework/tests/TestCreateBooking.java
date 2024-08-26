package AutomationLearning.APIframework.tests;

import org.testng.annotations.Test;

import AutomationLearning.APIframework.base.BaseTest;
import AutomationLearning.APIframework.endpoints.APIConstants;
import io.qameta.allure.Description;
import io.restassured.RestAssured;

public class TestCreateBooking extends BaseTest {

	
	@Test
	@Description("Verify whether booking is craeted")
	public void createbooking() {
		
		
		requestspecification.basePath(APIConstants.Booking_URL);
		
		response = RestAssured.given(requestspecification).when().body(payloadmanager.createpayload()).post();
		
		validatableresponse =response.then().log().all();
		validatableresponse.statusCode(200);
		
	
	
	
}
}
