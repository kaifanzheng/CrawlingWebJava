import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Crawl {
    public static void main(String[] args) throws IOException {
//        Document doc = Jsoup.connect("https://www.google.ca/").get();
//        String title = doc.title();
//        System.out.println("title: "+title);
//
//        Elements links = doc.select("a[href]");
//        for(Element link:links){
//            System.out.println("\nlink: "+link.attr("href"));
//            System.out.println("text: "+link.text());
//        }
//        System.out.println("Getting all imagese...");
//
//        Elements imags = doc.getElementsByTag("img");
//
//        for(Element src: imags){
//            System.out.println("src"+src.attr("src"));
//        }
        File file = new File("raw.html");

    }

}
