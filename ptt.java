import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ptt {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/index.html").get();//進入PTT網頁
            System.out.println(doc.title());//PTT開頭
            Elements items = doc.getElementsByClass("b-ent");//從doc中選擇b-ent裡面
            //for (Element item : items) {
            //String title = item.getElementsByClass("board-title").get(0).text();
            //System.out.println("Article title: ----------------------------------" + title);//PTT首頁第一篇
            //System.out.println("Article title: " + title);
            for (Element item1 : items) {//在b-ent裡面抓出board-name和board-title
                String num = item1.getElementsByClass("board-name").get(0).text();//"Baseball";"DIABLO";
                String title = item1.getElementsByClass("board-title").get(0).text();
                Document doc1 = Jsoup.connect("https://www.ptt.cc/bbs/" + num + "/index.html").get();//從board-name中選擇的素材與網頁組合並進入
                System.out.println("Board: " + num);
                System.out.println("Article title: " + title);
                Elements newsHeadlines = doc1.select("#main-container div.r-list-container.action-bar-margin.bbs-screen a");
                //System.out.println(doc1);
                for (Element headline : newsHeadlines) {
                    Elements items1 = doc1.getElementsByClass("r-ent");//從doc1中選擇r-ent
                    for (Element item2 : items1) {//從r-ent中逐步搜尋素材
                        Document doc2 = Jsoup.connect(headline.absUrl("href")).get();//進入Elements newsHeadlines所抓出的href的網址
                        Elements items2 = doc2.getElementsByClass("push");//從href網頁中選擇push
                        for(Element item3 : items2){
                            String num2 = item3.getElementsByClass("push").get(0).getElementsByTag("span").get(2).text();//在class底下選擇第三個span(第一個留言的位置)
                            String num3 = item3.getElementsByClass("push").get(0).getElementsByTag("span").get(1).text();
                            System.out.println("Comment:" + num3 + num2);
                            break;
                        }
                        break;
                    }
                    break;
                }
                //break;
                System.out.print("\n");
            }
            //break;
            //}
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
}

