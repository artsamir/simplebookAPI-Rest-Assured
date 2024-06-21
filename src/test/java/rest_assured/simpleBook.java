package rest_assured;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class simpleBook {
	
	String url = "https://simple-books-api.glitch.me";
	
	@Test (enabled = false)
	public void status() {
		
		// https://simple-books-api.glitch.me
		
		given().get("https://simple-books-api.glitch.me").then().log().all();
	}
	
	@Test (enabled = false)
	public void listOfBooks() {
		
		RestAssured.baseURI = url;
		given().get("/books").then().log().all();
	}
	
	@Test (enabled = false)
	public void getASingleBook() {
		
		RestAssured.baseURI = url;
		given().get("/books/2").then().log().all();
	}
	
	@Test (enabled = false)
	public void apiAuthentication() {
		
		JSONObject js = new JSONObject();
		js.put("clientName", "Postman");
		js.put("clientEmail", "samir12x@gmail.com");
		//  https://simple-books-api.glitch.me
		RestAssured.baseURI = url;
		given().contentType("application/json").body(js.toJSONString()).when().post("/api-clients/")
		.then().log().all();
	}
	
	@Test (enabled = false)
	public void submitAnOrder() {
		
		RestAssured.baseURI = url;
		
		JSONObject js = new JSONObject();
		js.put("bookId", "1");
		js.put("customerName", "John");
		
				
		/* 
		  access token = "d3f4bbf8c7e30eab9d41157b6473442e2f077facf09d59e970fc007098c9f761"
		  Authorization: Bearer <YOUR TOKEN>
		  */		
		
		given().header("Authorization", "Bearer " + "d3f4bbf8c7e30eab9d41157b6473442e2f077facf09d59e970fc007098c9f761")
		.contentType(ContentType.JSON).body(js.toJSONString()).when().post("/orders/")
		.then().log().all();
				
	}
	
	@Test (enabled = false)
	public void getAllOrders() {
		
		RestAssured.baseURI = url;
		given().header("Authorization", "Bearer " + "d3f4bbf8c7e30eab9d41157b6473442e2f077facf09d59e970fc007098c9f761")
		.get("/orders").then().log().all();
	
		// order id = "pi9ZeLTNX37yV47hLblmV"
	}
	
	@Test (enabled = true)
	public void getAnOrders() {
		
		RestAssured.baseURI = url;
		given().header("Authorization", "Bearer " + "d3f4bbf8c7e30eab9d41157b6473442e2f077facf09d59e970fc007098c9f761")
		.get("/orders/pi9ZeLTNX37yV47hLblmV").then().log().all();
		
		// order id = "pi9ZeLTNX37yV47hLblmV"
	}
	
	@Test (enabled = false)
	public void updateAnOrder() {
		
		RestAssured.baseURI = url;
		JSONObject js = new JSONObject();
		js.put("customerName", "Ayan");
		
		given().header("Authorization", "Bearer " + "d3f4bbf8c7e30eab9d41157b6473442e2f077facf09d59e970fc007098c9f761")
		.patch("/orders/pi9ZeLTNX37yV47hLblmV").then().log().all();
		
		// order id = "pi9ZeLTNX37yV47hLblmV"
	}
	
	@Test (enabled = false)
	public void deleteAnOrder() {
		
		RestAssured.baseURI = url;
		given().header("Authorization", "Bearer " + "d3f4bbf8c7e30eab9d41157b6473442e2f077facf09d59e970fc007098c9f761")
		.delete("/orders/pi9ZeLTNX37yV47hLblmV").then().log().all();
		
		// order id = "pi9ZeLTNX37yV47hLblmV"
	}
	
	
}


