import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


class JSONHandler {

    JSONHandler() 
    {

    }

@SuppressWarnings("unchecked")
	public static Object readJsonSimpleDemo(String filename) throws Exception 
	{  
        
    	FileReader reader = new FileReader(filename);
    	JSONParser jsonParser = new JSONParser();
    	return jsonParser.parse(reader);

	}
}