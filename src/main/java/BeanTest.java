import models.Albums;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Albums album = new Albums(1, "Michael Jackson", "Thriller", "30-Nov-82", 65, "Pop");
        Author author = new Author("R.L. Stine");
        Quote quote1 = new Quote("I'm a vegetarian", author);
        Quote quote2 = new Quote("I'm a vegetarian", author);

        ArrayList<Quote> quotes = new ArrayList<Quote>();
        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes){
            System.out.printf("Quote: %s\nAuthor: %s\n\n", quote.getQuote(), quote.getAuthor());
        }
    }

}
