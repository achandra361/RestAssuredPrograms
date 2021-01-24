package restassuredtest;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostUsingPojoClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User("dean@supernatural.com", "Dean", "Winchester");
		user.setMobileNumber(98338484,737372828,74747411);
		Response response = given().contentType(ContentType.JSON).body(user).log().all().post("http://localhost:8080/api/users");
		
		System.out.println(response.asPrettyString());
		System.out.println("Status Code-"+response.getStatusCode());

	}

}
