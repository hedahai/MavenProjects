package com.tiny.util;

import com.gargoylesoftware.htmlunit.TextPage;
import com.gargoylesoftware.htmlunit.WebClient;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Tiny
 * Date: 15-1-19
 * Time: 下午10:32
 * To change this template use File | Settings | File Templates.
 */
public class TestAPI {

    public static void main(String[] args){
        WebClient client = new WebClient();

        TextPage page = null;

        try {
            page = client.getPage("http://baike.baidu.com/cms/lemmaconfig/navbarAd.json");
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.print(page.getWebResponse().getContentAsString());

    }
}
