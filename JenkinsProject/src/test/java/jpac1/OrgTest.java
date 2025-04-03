package jpac1;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createOrg()
	{
		System.out.println("Execution of createOrg");
		
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
	}
	
	@Test
	public void editOrg()
	{
		System.out.println("Execution of editOrg");
	}
	
	@Test
	public void deleteOrg()
	{
		System.out.println("Execution of deleteOrg");
	}

}
