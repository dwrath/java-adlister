import models.Albums;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Albums album = new Albums(1, "Michael Jackson", "Thriller", "30-Nov-82", 65, "Pop");
        Author author1 = new Author("R.L. Stine");
        Author author2 = new Author("J.K. Rowling");
        Quote quote1 = new Quote("I'm a vegetarian", author1);
        Quote quote2 = new Quote("I'm a wizard", author2);

        ArrayList<Quote> quotes = new ArrayList<Quote>();
        quotes.add(quote1);
        quotes.add(quote2);

        for(Quote quote : quotes){
            System.out.printf("Quote: %s\nAuthor: %s\n\n", quote.getQuote(), quote.getAuthor());
        }
    }

}
