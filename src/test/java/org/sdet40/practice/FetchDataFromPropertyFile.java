package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("./src/test/resources/mine.properties");
Properties p=new Properties();
p.load(fis);
String url=p.getProperty("url").trim();
String browser=p.getProperty("Browser").trim();

System.out.println(url);
System.out.println(browser);

	}

}
