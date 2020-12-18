package com.boot.parse.test;

import com.boot.parse.util.JsoupUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * @author gekaihui
 * @date 2020/12/9
 */
public class ParseAction {
    public static void main(String[] args) {
        String url = "http://127.0.0.1:8080/tamsDemo/hello";
//			Document doc = Jsoup.connect(url).get();
        Document doc = JsoupUtil.getDocument(url);
//			Element body = doc.body();
        Element element = doc.select("form").first();
        Elements childrens = element.children();
        Element table5 = childrens.get(5);
        Element tr = table5.select("tr").first();
        System.out.println(tr.text().toString());
        Element table6 = childrens.get(6);
        Elements trs = table6.select("tr").first().select("table").first().select("tr").first().select("table").first().select("tr");
        for (Element tr2 : trs) {
            System.out.println(tr2.text().toString());
        }
    }
}

