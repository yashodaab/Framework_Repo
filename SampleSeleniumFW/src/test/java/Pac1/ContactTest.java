package Pac1;

import org.bouncycastle.its.ITSPublicEncryptionKey.symmAlgorithm;
import org.testng.annotations.Test;

public class ContactTest {
@Test
public void createcontactTest() {
	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("chrome");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("execute createcontactTest");
	
}
@Test
public void modifycontactTest() {
	System.out.println("execute modifycontactTest");
}
}
