package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement {

	public static String assignJsonValue(String requestBody, String variableName, String variableValue) {

		requestBody = requestBody.replaceAll(Pattern.quote("{{" + variableName + "}}"), variableValue);
		return requestBody;
	}

}
