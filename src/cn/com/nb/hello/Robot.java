package cn.com.nb.hello;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description
 * @author: liying.fu
 * @Date: 2018/9/23 下午10:00
 */
public class Robot {
    public static void main(String[] args) {
        URL url = null;
        URLConnection urlconn = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        String regex = "https://[\\w+\\.?/?]+\\.[A-Za-z]+";//url匹配规则
        Pattern p = Pattern.compile(regex);
        try {
            url = new URL("https://cryptopanic.com/news/media");//爬取的网址、这里爬取的是一个生物网站
            urlconn = url.openConnection();
            pw = new PrintWriter(new FileWriter("/Users/apple/work/IdeaProjects/java-review/SiteURL.txt"), true);//将爬取到的链接放到D盘的SiteURL文件中
            br = new BufferedReader(new InputStreamReader(
                    urlconn.getInputStream()));
            String buf = null;
            while ((buf = br.readLine()) != null) {
                Matcher buf_m = p.matcher(buf);
                while (buf_m.find()) {
                    pw.println(buf_m.group());
                }
            }
            System.out.println("爬取成功^_^");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pw.close();
        }
    }
}
