package com.qa.tests;

import com.qa.base.TestBase;
import com.qa.client.RestClient;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class GetApiTest extends TestBase {
    TestBase testbase;
    String url;
    String serviceurl;
    String actualurl ;
    RestClient restClient;


    @BeforeMethod
    public void setup() throws ClientProtocolException, IOException
    {
        /*testbase = new TestBase();
        GetApiTest obj = new GetApiTest();
        obj.url = prop.getProperty("URL");
        obj.serviceurl = prop.getProperty("serviceURL");
        obj.actualurl = url+serviceurl;
        System.out.println(actualurl);*/
        //System.out.println(actualurl);
        //restClient.get(actualurl);

    }

    @Test
    public void getAPITest () throws ClientProtocolException, IOException
    {
        testbase = new TestBase();
        url = prop.getProperty("URL");
        serviceurl = prop.getProperty("serviceURL");
        actualurl = url+serviceurl;
        System.out.println(actualurl);
        restClient = new RestClient();
        System.out.println(actualurl);
        restClient = new RestClient();
        restClient.get(actualurl);

    }
}
