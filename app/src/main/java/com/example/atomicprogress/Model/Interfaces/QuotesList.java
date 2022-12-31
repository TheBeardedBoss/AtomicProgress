package com.example.atomicprogress.Model.Interfaces;

public class QuotesList {
    private final String quote;
    private final String author;

    public QuotesList(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public String getAuthor() {
        return author;
    }
}
