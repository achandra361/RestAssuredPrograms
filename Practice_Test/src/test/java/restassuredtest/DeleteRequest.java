package restassuredtest;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response = given().contentType(ContentType.JSON).get("http://localhost:8080/api/users");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
	
		
		
		

	}

}
