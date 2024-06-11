package org.testing.testSteps;

import static io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {
	Properties pr;

	public HttpMethods(Properties pr) {
		this.pr = pr;

	}

	public Response postMethod(String jsonBody, String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		Response res = given().contentType(ContentType.JSON).body(jsonBody).when().post(uriValue);

		System.out.println("status code is " + res.statusCode());
		return res;

	}

	public void GetAll(String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		Response res = given().contentType(ContentType.JSON).when().get(uriValue);

		System.out.println("status code is " + res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());

	}
	
	public void GetParticular(String uriKeyName, String endPointValue) {
		String uriValue = pr.getProperty(uriKeyName) + "/" + endPointValue;
		Response res = given().contentType(ContentType.JSON).when().get(uriValue);

		System.out.println("status code is " + res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());

	}
	
	public  Response putMethod(String jsonBody, String uriKeyName, String endPoint) {
		String uriValue = pr.getProperty(uriKeyName) + "/" + endPoint;
		Response res = given().contentType(ContentType.JSON).body(jsonBody).when().put(uriValue);

		System.out.println("status code is " + res.statusCode());
		return res;

	}
	
	public void DeleteMethod(String uriKeyName, String endPointValue) {
		String uriValue = pr.getProperty(uriKeyName) + "/" + endPointValue;
		Response res = given().contentType(ContentType.JSON).when().delete(uriValue);

		System.out.println("status code is " + res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());

	}
	
	


}
