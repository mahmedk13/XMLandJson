package Rough;

import java.io.IOException;

import utilities.JSONReader;
import utilities.XMLReader;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XMLReader reader = new XMLReader(System.getProperty("user.dir")+"\\src\\test\\resources\\locators\\OR.xml");
		System.out.println(reader.getLocator("password.xpath"));
		
		JSONReader jreader = new JSONReader(System.getProperty("user.dir")+"\\src\\test\\resources\\locators\\OR.json");
		System.out.println(jreader.getLocator("locators.homepage.username.xpath"));

		

	}

}
