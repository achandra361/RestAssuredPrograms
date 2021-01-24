package restassuredtest;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PostRequest {
	
	public static void main(String[] args) {
		
		/*Response response = given().auth()
		.basic("sk_test_51I3x7hIC4fdnetsEvesF4CFOkhi4bQLzTgd5RlXOINQ3IR8SM8hqy4T0tpYzTsDgNLt8jMxhlXixHEG6h9gzaACj00EED6SCKB", "")
		.formParam("name","Rikki" ).formParam("email", "rikki@aquafian.com").formParam("description","This is a post request")
		.post("https://api.stripe.com/v1/customers");
		
		System.out.println(response.asPrettyString());
		System.out.println("Status Coede-"+response.getStatusCode());*/
		
		/*HashMap<String,String> map = new HashMap<>();
		
		map.put("email", "sammy@supernaturl.com");
		map.put("firstname", "Sammy");
		map.put("lastname", "Winchester");*/
		
		Response response = given().contentType(ContentType.JSON).body(new File("./customers.json")).log().all().post("http://localhost:8080/api/users");
		
		System.out.println(response.asPrettyString());
		System.out.println("Status Code-"+response.getStatusCode());
		
	}

}
