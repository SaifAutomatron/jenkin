package com.script.test;

import org.testng.annotations.Test;

public class CreateOrgTest {
	
	@Test
	public void createOrg()
	{
		System.out.println("Organisation Created");
	}

	@Test
	public void createOrgWithContact()
	{
		System.out.println("Organisation Created with contact");
	}

	@Test
	public void deletecOrg()
	{
		System.out.println("Organisation deleted");
	}

}
