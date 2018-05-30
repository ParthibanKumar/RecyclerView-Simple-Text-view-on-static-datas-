package com.example.saran.simple_recycler_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] textuals = {"Video games are the current Trend", " people of all ages are behind the various kinds", "video games available today","A game is an activity or sport usually involving skill", "in which you follow fixed rules", "ticiple occasioning, past tense, past participle occasioned\n" +
            "1. countable noun\n" +
            "An occasion is a time when something happens, or a case of it happening", "I often think fondly of an occasion some years ago at Covent Garden.\n" +
            "Mr Davis has been asked on a number of occasions", "An occasion is an important event, ceremony, or celebration", "Taking her with me on official occasions has been a challenge.\n" +
            "It will be a unique family occasion", "An occasion for doing something is an opportunity for doing it", "It is an occasion for all the family to celebrate", "To occasion something means to cause it","He argued that the release of hostages should not occasion a change in policy","the time of a particular happening or event"};
    ArrayList<ListModel> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.recylerview);
        for(int i=0;i<textuals.length;i++)
        {
            ListModel listModel = new ListModel(textuals[i]);
            arrayList.add(listModel);
        }

        adapter=new CustomAdapter(this,arrayList);
        rv.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }
}
