package com.apitest.nsp.ApiTesting;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

@Test
public class RestClient {
	
	@Test
	public void getMethod() throws ClientProtocolException, IOException, JSONException{
        
	    String url ="https://gorest.co.in/public/v1/users";
		         
		CloseableHttpClient httpClient=HttpClients.createDefault();
		         
		         
		HttpGet request = new HttpGet(url); 
	    request.addHeader("Content-Type" , "application/json");
	
		         
		CloseableHttpResponse response = httpClient.execute(request); 
		
		int code = response.getStatusLine().getStatusCode();
		System.out.println("Response code is" + code);
		
		
		Assert.assertEquals(200, code);
		String responseString = EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(responseString);
		
		
		 
	}

}
