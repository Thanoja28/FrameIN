package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonParsing;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC1_PostRequest {
	
	public static String returnIdValue;

	public void testCase1() throws IOException {

		Properties p1 = PropertiesHandle.loadProperties("../Framework/URI.properties");
		String requestBody = JsonHandle
				.readjsonData("../Framework/src/test/java/org/testing/resources/requestbody.json");

		System.out.println("Enter Id value");
		Scanner sc = new Scanner(System.in);
		Integer idValue = sc.nextInt();
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", idValue.toString());
		HttpMethods http = new HttpMethods(p1);
		
		Response resobj = http.postMethod(requestBody, "QA_URI");
		returnIdValue = JsonParsing.doParsing(resobj, "id");
	}

}
