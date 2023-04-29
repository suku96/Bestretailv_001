package com.bestretail.qspisders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This class facilitates file handling to fetch data from property file
 * @author HP
 *
 */
public class FileUtility {
	/**
	 * we can read data from the property file in the form of key and value
	 * author sukumar
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/bestretaildata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}
}
