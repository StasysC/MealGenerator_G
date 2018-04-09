package com.stasys.mealgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class GeneratedActivity extends AppCompatActivity {
    ExpandableListView expandableListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        ExpandableListViewAdapter adapter = new ExpandableListViewAdapter(GeneratedActivity.this);
        //expandableListView.expandGroup(adapter.getGroupCount());
        expandableListView.setAdapter(adapter);
    }
}
