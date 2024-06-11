package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesHandle;

public class TC3_GetParticular {
	public void testcase3() throws IOException {

		Properties p = PropertiesHandle.loadProperties("../Framework/URI.properties");
		HttpMethods http = new HttpMethods(p);
		http. GetParticular("QA_URI", TC1_PostRequest.returnIdValue );

	}
}
