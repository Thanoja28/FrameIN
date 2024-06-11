package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAll;
import org.testing.testScripts.TC3_GetParticular;
import org.testing.testScripts.TC4_PutRequest;
import org.testing.testScripts.TC5_DeleteRequest;

public class trigger {
	public static void main(String[] args) throws IOException {
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.testCase1();
		TC2_GetAll tc2 = new TC2_GetAll();
		tc2.testCase2();
		TC3_GetParticular tc3 = new TC3_GetParticular();
		tc3.testcase3();
		TC4_PutRequest tc4 = new TC4_PutRequest();
		tc4.testCase4();
		TC5_DeleteRequest tc5 = new TC5_DeleteRequest();
		tc5.testCase5();
		
	}
}
