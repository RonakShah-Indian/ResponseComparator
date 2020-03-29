package com.responsecomparator.comparator;

import java.io.File;

/**
 * @author Ronak
 *
 */
public interface IComparator {
	
	public boolean compare(String response1, String response2);
	public void getData(File file1, File file2);

}
