package AutomationLearning.APIframework.base;

import org.testng.annotations.BeforeTest;

import AutomationLearning.APIframework.endpoints.APIConstants;
import AutomationLearning.APIframework.modules.PayLoadManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class BaseTest {

	public RequestSpecification requestspecification;
	public PayLoadManager payloadmanager;
	public Response response;
	public ValidatableResponse validatableresponse;
	
	@BeforeTest
	public void setconfig() {
		System.out.println("Before test");
		payloadmanager =new PayLoadManager();
		requestspecification = RestAssured.given().
				baseUri(APIConstants.Base_URL).
				contentType(ContentType.JSON).
				log().all();
				
		
		
		
	}
	
	
	
	
	
}
