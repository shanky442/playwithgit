package com.test.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;

public class VaultTest {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        final String USER_AGENT = "Mozilla/5.0";
        String url = "https://vault.heliosalliance.net:8200/v1/secret/password";
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);

     // add request header
     request.addHeader("User-Agent", USER_AGENT);
     request.addHeader("X-Vault-Token","c88efc81-2c6f-e6ea-886d-ced8c69d92cc");
     HttpResponse response = client.execute(request);

     System.out.println("Response Code : "
                     + response.getStatusLine().getStatusCode());

     BufferedReader rd = new BufferedReader(
         new InputStreamReader(response.getEntity().getContent()));

     StringBuffer result = new StringBuffer();
     String line = "";
     while ((line = rd.readLine()) != null) {
         result.append(line);
     }
     System.out.println(result);
     String fresult = result.toString();
     System.out.println(fresult);
     Gson gson = new Gson();
     Map json = gson.fromJson(fresult, Map.class);
     String jsonData = json.get("data").toString();
     Map data = gson.fromJson(jsonData, Map.class);
     System.out.println(data.get("secret").toString());
     
    }

}
