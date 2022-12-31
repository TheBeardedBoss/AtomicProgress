package com.example.atomicprogress.Model.Repository;

import com.example.atomicprogress.Model.Interfaces.QuotesList;

import java.util.ArrayList;
import java.util.List;

public class QuotesData {
    public static List<QuotesList> getQuotes() {
        final List<QuotesList> allQuotesList = new ArrayList<>();
        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");
        allQuotesList.add(quote1);
        QuotesList quote2 = new QuotesList("Learn as if you will live forever, live like you will die tomorrow.", "Mahatma Gandhi");
        allQuotesList.add(quote2);
        QuotesList quote3 = new QuotesList("Stay away from those people who try to disparage your ambitions. Small minds will always do that, but great minds will give you a feeling that you can become great too.", "Mark Twain");
        allQuotesList.add(quote3);
        QuotesList quote4 = new QuotesList("When you give joy to other people, you get more joy in return. You should give a good thought to happiness that you can give out.", "Eleanor Roosevelt");
        allQuotesList.add(quote4);
        QuotesList quote5 = new QuotesList("When you change your thoughts, remember to also change your world", "Norman Vincent Peale");
        allQuotesList.add(quote5);
        QuotesList quote6 = new QuotesList("It is only when we take chances, when our lives improve. The initial and the most difficult risk that we need to take is to become honest", "Walter Anderson");
        allQuotesList.add(quote6);
        QuotesList quote7 = new QuotesList("Nature has given us all the pieces required to achieve exceptional wellness and health, but has left it to us to put these pieces together", "Diane McLaren");
        allQuotesList.add(quote7);
        QuotesList quote8 = new QuotesList("Success is not final; failure is not fatal: It is the courage to continue that counts", "Winston S. Churchill");
        allQuotesList.add(quote8);
        QuotesList quote9 = new QuotesList("It is better to fail in originality than to succeed in imitation", "Herman Melville");
        allQuotesList.add(quote9);
        QuotesList quote10 = new QuotesList("The road to success and the road to failure are almost exactly the same.", "Colin R. Davis");
        allQuotesList.add(quote10);
        QuotesList quote11 = new QuotesList("Success usually comes to those who are too busy looking for it", "Henry David Thoreau");
        allQuotesList.add(quote11);
        QuotesList quote12 = new QuotesList("Develop success from failures. Discouragement and failure are two of the surest stepping stones to success", "Dale Carnegie");
        allQuotesList.add(quote12);
//        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");
//        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");
//        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");
//        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");
//        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");
//        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");
//        QuotesList quote1 = new QuotesList("We cannot solve problems with the kind of thinking we employed when we came up with them", "Albert Einstein");

        return allQuotesList;
    };
}
