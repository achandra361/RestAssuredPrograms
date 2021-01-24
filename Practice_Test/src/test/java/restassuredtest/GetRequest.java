package restassuredtest;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;


public class GetRequest {
	
	public static void main(String[] args) {
		
	Response response =	given().auth()
			.basic("sk_test_51I3x7hIC4fdnetsEvesF4CFOkhi4bQLzTgd5RlXOINQ3IR8SM8hqy4T0tpYzTsDgNLt8jMxhlXixHEG6h9gzaACj00EED6SCKB","")
			.formParam("limit", 3).get("https://api.stripe.com/v1/customers");
	String jsonresponse = response.asPrettyString();
	//System.out.println(jsonresponse);
	System.out.println("Status Code-"+response.getStatusCode());
		
		}

}
