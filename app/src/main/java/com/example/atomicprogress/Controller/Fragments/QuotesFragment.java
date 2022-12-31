package com.example.atomicprogress.Controller.Fragments;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.atomicprogress.Model.Interfaces.QuotesList;
import com.example.atomicprogress.Model.Repository.QuotesData;
import com.example.atomicprogress.R;

import java.util.ArrayList;
import java.util.List;


public class QuotesFragment extends Fragment {
    View view;
    private TextView quoteTextView,authorNameTextView;
    private final List<QuotesList> quotesLists = new ArrayList<>();

    //current position!
    private int currentQuotePosition = 0;
    TextView motivationTitle;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_quotes, container, false);
         final TextView motivationTitle = view.findViewById(R.id.motivationTitleTextView);
         quoteTextView = view.findViewById(R.id.quoteTextView);
         authorNameTextView = view.findViewById(R.id.authorNameTextView);
         final Button previousBtn = view.findViewById(R.id.previousButton);
         final Button nextBtn = view.findViewById(R.id.nextButton);
         final ImageView copyBtn = view.findViewById(R.id.copyButton);


        showQuotes();
        setQuoteToTextView();
        previousBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 currentQuotePosition --;
                 if (currentQuotePosition < 0){
                     currentQuotePosition = quotesLists.size() - 1;
                 }
                setQuoteToTextView();
             }
         });
         nextBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 currentQuotePosition++;
                 if (currentQuotePosition >= quotesLists.size()){
                     currentQuotePosition = 0;
                 }
                setQuoteToTextView();
             }
         });

         copyBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ClipboardManager clipboardManager = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                 ClipData clipdata = ClipData.newPlainText("quote", quotesLists.get(currentQuotePosition).getQuote()+"\nby " +quotesLists.get(currentQuotePosition).getAuthor());
                clipboardManager.setPrimaryClip(clipdata);
             }
         });

        return view;
    }

    private void setQuoteToTextView() {
        quoteTextView.setText(quotesLists.get(currentQuotePosition).getQuote());
        authorNameTextView.setText(quotesLists.get(currentQuotePosition).getAuthor());
    }

    private void showQuotes() {
        quotesLists.addAll(QuotesData.getQuotes());
    }
}