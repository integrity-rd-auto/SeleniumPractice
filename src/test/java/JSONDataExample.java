import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedHashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
 
public class JSONDataExample {
	String n;
 
	public String readJSONData(String keyword) throws IOException, ParseException{
 
		Reader reader = new FileReader("F:\\workspace\\PageObjectModelBasics\\SeleniumPractice\\src\\test\\java\\testdata.json");
					
		JSONParser parser = new JSONParser();
		
		JSONArray jsonArr = (JSONArray)parser.parse(reader);
		
		for(Object obj : jsonArr){
			
			JSONObject jo = (JSONObject)obj;			
			n = (String)jo.get(keyword);
			
		}
	
		return n;
		
	}
 
	public static void main(String[] args) throws IOException, ParseException{
		JSONDataExample e = new JSONDataExample();
		String a = e.readJSONData("Blog URL");
		String firstName = e.readJSONData("first name");
		String lastName = e.readJSONData("last name");
		System.out.println(a);
		System.out.println(firstName);
		System.out.println(lastName);
	}
 
}