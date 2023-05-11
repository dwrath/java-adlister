package models;

public class Quote {
    private String quote;
    private Author author;

    public Quote() {
    }

    public Quote(String quote, Author author) {
        this.quote = quote;
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author.getName();
    }
}
