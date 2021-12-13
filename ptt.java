import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class ptt {
        public static void main(String[] args) {
            try {
                Document doc = Jsoup.connect("/bbs/Gossiping/M.1638258698.A.66E.html").get();
                System.out.println(doc.title());
                Elements newsHeadlines = doc.select("#r-ent ");
                for (Element headline : newsHeadlines) {
                    System.out.println(headline.attr("title"));
                    System.out.println(headline.absUrl("href"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


