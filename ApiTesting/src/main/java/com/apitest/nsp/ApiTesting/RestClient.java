package com.apitest.nsp.ApiTesting;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

@Test
public class RestClient {
    String pathUrl ="https://gorest.co.in/public/v1/users";

	
	@Test
	public void getMethod() throws  IOException, JSONException{
        
		         
		OkHttpClient httpClient= new OkHttpClient().newBuilder()
				  .build();	
		
		Request request = new Request.Builder()
				  .url(pathUrl)
				  .method("GET", null)
				  .addHeader("Content-Type", "application/json")
				  .build();
		Response response = httpClient.newCall(request).execute();
		int code = response.code();
	
		String responseBody = response.body().string();
		System.out.println("Response code is" + responseBody);
	
		
		Assert.assertEquals(200, code);
		
		
		 
	}
	
	@Test
	public void postMethod() throws  IOException, JSONException {
		
		
		 OkHttpClient httpClient= new OkHttpClient().newBuilder()
				  .build();
		
		 MediaType mediaType = MediaType.parse("text/plain");
		 
		 
		 JSONObject json=new JSONObject();
    	 json.put("name","aamir neova");
		 
    	 json.put("gender","male");
		 json.put("email","neova2@gmail.com");
		 json.put("status","active");
		 RequestBody body = RequestBody.create(json.toString(),mediaType);
//		 RequestBody body = RequestBody.create(mediaType, "{\r\n    \"name\": \"Tenali Ram\",\r\n    \"gender\": \"male\",\r\n    \"email\": \"inhjhghs.demo@1.com\",\r\n    \"status\": \"active\"\r\n}");
		 Request request = new Request.Builder()
				  .url("https://gorest.co.in/public/v1/users")
				  .method("POST", body)
				  .addHeader("Authorization", "Bearer 3a319edad5387927771c3119e0d2960640c96800b2850deaf1e2b3faef1e34fb")
				  .addHeader("Content-Type", "application/json")
				  .build();
		 Response response = httpClient.newCall(request).execute();
		 int code = response.code();

		 System.out.println("Response code is" + code);
		
			
		 Assert.assertEquals(200, code);
			
	}
	
	
	@Test
	public void patchMethod() throws  IOException, JSONException {
		
		OkHttpClient client = new OkHttpClient().newBuilder()
				  .build();
				MediaType mediaType = MediaType.parse("text/plain");
				 
				 JSONObject json=new JSONObject();
		    	 json.put("id","109");
				 
		    	 json.put("user_id",201);
				 json.put("title","neova");
				 json.put("body","active");
				 RequestBody body = RequestBody.create(json.toString(), mediaType);
				Request request = new Request.Builder()
				  .url("https://gorest.co.in/public/v1/users")
				  .method("PATCH", body)
				  .build();
				Response response = client.newCall(request).execute();
				 int code = response.code();

				 System.out.println("Response code is" + code);
				
					
				 Assert.assertEquals(200, code);
		
	}

}