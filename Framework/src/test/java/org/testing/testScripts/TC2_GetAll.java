package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;

public class TC2_GetAll {
	
	public void testCase2() throws IOException {
		Properties p = PropertiesHandle.loadProperties("../Framework/URI.properties");
		HttpMethods http = new HttpMethods(p);
		http.GetAll("QA_URI");
	}

}
