package com.boot.parse.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author gekaihui
 * @date 2020/12/9
 */
public class JsoupUtil {
    /**
     * get请求
     *
     * @param url
     * @return
     */
    public static Document getDocument(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    public static Document getDocumentPost(String url) {
        Document doc = null;
        try {
            doc = Jsoup.connect(url)
                    .data("query", "Java")
                    .userAgent("Mozilla")
                    .cookie("auth", "token")
                    .timeout(3000)
                    .post();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return doc;
    }
}
