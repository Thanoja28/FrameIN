package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;


import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandle;

import io.restassured.response.Response;

public class TC4_PutRequest {
	public void testCase4() throws IOException {
		Properties p1 = PropertiesHandle.loadProperties("../Framework/URI.properties");
		String requestBody = JsonHandle
				.readjsonData("../Framework/src/test/java/org/testing/resources/updaterequestbody.json");
		requestBody = JsonReplacement.assignJsonValue(requestBody, "id", TC1_PostRequest.returnIdValue);
		HttpMethods http = new HttpMethods(p1);

		Response resobj = http.putMethod(requestBody, "QA_URI", TC1_PostRequest.returnIdValue);

	}

}
