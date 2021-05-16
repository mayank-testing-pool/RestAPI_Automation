package com.qa.client;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONML;
import org.json.JSONObject;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.net.www.http.HttpClient;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.HashMap;

public class RestClient {

    // 1- GET Method
    public void get (String url) throws ClientProtocolException, IOException
    {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // createDefault method Create one client connection and return CloseableHttpClient class type object
        HttpGet httpget = new HttpGet(url);
        // Create one Get connection with URL
        CloseableHttpResponse httpresponse = httpclient.execute(httpget);
        //Hit the Get URL and return response which store in an object of CloseableHttpResponse
        int statusCode = httpresponse.getStatusLine().getStatusCode();
        System.out.println("Status Code = "+statusCode);
        //Get status code and print it
        String responsestring = EntityUtils.toString(httpresponse.getEntity(), "UTF-8");
        //Converting the get response in to string
        //UTF-8 is character set
        JSONObject responsejson = new  JSONObject(responsestring);
        System.out.println("response JSON from API" +responsejson);
        // All headers
        Header [] headerarray = httpresponse.getAllHeaders();
        HashMap<String,String> allheaders = new HashMap<String, String>();
        for (Header header : headerarray)
        {
            allheaders.put(header.getName(),header.getValue());

        }
        System.out.println("Headers = " +allheaders);







    }
}
