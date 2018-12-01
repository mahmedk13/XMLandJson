package utilities;

import java.io.File;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;

public class JSONReader {
	
	private File jsonFile;
	private String fileName;
	
	public JSONReader(String fileName){
		this.fileName=fileName;
	}
	
	public String getLocator(String locator) throws IOException{
		jsonFile = new File(fileName);
		
			return JsonPath.read(jsonFile, "$."+locator);
	} 
	
}


