import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {
    public static void main(String args[]) {

        try {
            final Document document = Jsoup.connect("https://www.easycity.sg/serviced-common-bedroom-at-versilia-near-kinex-mall/").get();
            //System.out.println(document.outerHtml());
            Elements elements = document.getAllElements();
            System.out.println(document.getElementsByClass("apartment_wrap"));
           // System.out.println(document.getElementsByClass("ListingCard.listing_card_container.3GDeS"));
            //  for(Element element=elements){
            //   System.out.println(document.getElementById("Home__lists_container__1FY7x"));
//              System.out.println(elements);
            //}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
