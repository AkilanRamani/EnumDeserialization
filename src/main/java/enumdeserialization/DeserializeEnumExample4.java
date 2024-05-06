package enumdeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeEnumExample4 {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		 String jsonString = "{\"distance\": {\"unit\":\"inches\",\"meters\":0.0254}}";  
         
	        // create an instance of the ObjectMapper class  
	        ObjectMapper mapper = new ObjectMapper();  
	      
	        //deserialize jsonString by using readValue() method of ObjectMapper class  
	        City obj = mapper.readValue(jsonString, City.class);  
	          
	        // print distance of the City  
	        System.out.println("Distance of the City: "+ obj.getDistance());  
	    }  
	}


