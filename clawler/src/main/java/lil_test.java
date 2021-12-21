import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class lil_test {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://rule.nkust.edu.tw").get();
            System.out.println(doc.title());

            Elements newsHeadlines = doc.select("#Dyn_2_2 a");
            for (Element headline : newsHeadlines) {
                System.out.println(headline.attr("title"));
                System.out.println(headline.absUrl("href"));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

}