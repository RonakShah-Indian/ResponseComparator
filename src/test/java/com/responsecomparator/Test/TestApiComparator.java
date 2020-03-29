package com.responsecomparator.Test;

import java.io.File;

import com.responsecomparator.comparator.APIComparator;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestApiComparator {
	File file1, file2;
	@BeforeTest
	public void setUp()	{
		
		System.out.println("\n" + "  +++++++++++++++++++++++++++++++++++++++++" 
					   	 + "\n" + "  ++    API Comparator test starts...    ++"
					     + "\n" + "  +++++++++++++++++++++++++++++++++++++++++" + "\n");


		String path = System.getProperty("user.dir");
		file1 = new File(path+"/resources/ApiList1.txt");
		file2 = new File(path+"/resources/ApiList2.txt");
	}

	@Test
	public void verifyApiResponses() {
		APIComparator testComp = new APIComparator();
		testComp.getData(file1, file2);
	}

	@AfterTest
	public void tearDown() {
		
		System.out.println("  ++++++++++++++++++++++++++++++++++++++++++" 
				+ "\n" +   "  ++    API Comparator test ends...!!!    ++"
				+ "\n" +   "  ++++++++++++++++++++++++++++++++++++++++++" + "\n");
	}
}
