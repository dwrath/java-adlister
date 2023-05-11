package models;

public class Quote {
    private String quote;
    private String author;

    public Quote() {
    }

    public Quote(String quote, Author author) {
        this.quote = quote;
        this.author = author.getName();
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}
