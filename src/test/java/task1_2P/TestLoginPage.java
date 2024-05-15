package task1_2P;
import org.junit.Assert;
import org.junit.Test;

import sit707_week1.SeleniumOperations;


public class TestLoginPage {
	@Test
	public void testBlankEmailBlankPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("", ""));
	}
	
	@Test
	public void testBlankEmailInvalidPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("", "not a real password"));
	}
	
	@Test
	public void testBlankEmailValidPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("", "Gruhi1211@"));
	}
	
	@Test
	public void testInvalidEmailBlankPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("notarealemail@gmail.com", ""));
	}
	
	@Test
	public void testInvalidEmailInvalidPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("notarealemail@gmail.com", "not a real password"));
	}
	
	@Test
	public void testInvalidEmailValidPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("notarealemail@gmail.com", "Gruhi1211@"));
	}
	
	@Test
	public void testValidEmailBlankPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("patelgruhi299@gmail.com", ""));
	}
	
	@Test
	public void testValidEmailInvalidPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("patelgruhi299@gmail.com", "not a real password"));
	}
	
	@Test
	public void testValidEmailValidPassword() {
		Assert.assertFalse(SeleniumOperations.loginPageTest("patelgruhi299@gmail.com", "Gruhi1211@"));
	}
}
