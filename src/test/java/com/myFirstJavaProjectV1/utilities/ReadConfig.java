package com.myFirstJavaProjectV1.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;

	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("The exception is " + e.getMessage());
		}			
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName()
	{
		String uname = pro.getProperty("username");
		return uname;
	}
	
	public String getPassword()
	{
		String pswd = pro.getProperty("password");
		return pswd;
	}
	
	public String getChromePath()
	{
		String path = pro.getProperty("chromePath");
		return path;
	}
	
	public String getFirefoxPath()
	{
		String path = pro.getProperty("firefoxPath");
		return path;
	}
	
	public String getIEPath()
	{
		String path = pro.getProperty("iePath");
		return path;
	}
}
