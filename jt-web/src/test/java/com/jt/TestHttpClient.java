package com.jt;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @BelongsProject: jta
 * @BelongsPackage: com.jt
 * @CreateTime: 2020-04-20 19:12
 * @Description:
 */

public class TestHttpClient {
    /*
     * 1.实例化httpClient对象
     * 2.准备url请求地址
     * 3.封装请求方式对象  get/post/put/delete
     * 4.发起http请求,获取获取服务器响应
     * 5.判断返回值状态码信息200
     * 6.从响应对象中获取服务器返回值数据
     */
    @Test
    public void testGet() throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        String url = "https://www.baidu.com";
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response = client.execute(get);
        if (response.getStatusLine().getStatusCode()==200){
            //表示服务请求正确
            HttpEntity entity = response.getEntity();//返回值实体对象
            String result = EntityUtils.toString(entity,"UTF-8");
            System.out.println(result);
        }
    }

}
