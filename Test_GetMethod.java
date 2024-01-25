package RestAssuredAPITesting.RestAssuredAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class Test_GetMethod {

	@Test
	public void test01()
	{
	Response respones = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Respones code:" + respones.getStatusCode());
		System.out.println("Respones body:" + respones.getBody().asString());
		System.out.println("Respones Time:" + respones.getTime());
		System.out.println("Respones Header:" + respones.getHeader("Content-type"));
		
		//validate status code
		//expected status code = 200
		
		int expectedStatusCode = 200;
		int statuscode = respones.getStatusCode();
		Assert.assertEquals(expectedStatusCode, statuscode);
	}
		@Test
		public void test02()
		{
			//given, when ,then
		  RestAssured.baseURI="https://reqres.in/api/users";
		  RestAssured.given().queryParam("page", "2").when().get().then().statusCode(200);
		  
		}
}
	
	


