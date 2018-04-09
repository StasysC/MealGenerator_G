package com.stasys.mealgenerator;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;


/**
 * Created by Stasys on 4/4/2018.
 */

public class ExpandableListViewAdapter extends BaseExpandableListAdapter {

    LayoutInflater mInflator;
    String[] headers = {"Breakfast", "Lunch", "Evening meal"};
    String[][] subText = {{MealsData._breakFast}, {MealsData._lunch}, {MealsData._eveningMeal}};

    Context contex;

    public ExpandableListViewAdapter(Context contex) {
        this.contex = contex;
    }

    @Override
    public int getGroupCount() {
        return headers.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return subText[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return headers[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View v, ViewGroup parent) {
        TextView txtView = new TextView(contex);
        txtView.setText(headers[groupPosition]);
        txtView.setTextColor(Color.parseColor("#818181"));
        txtView.setGravity(Gravity.CENTER);
        txtView.setTextSize(30);
        return txtView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View view, ViewGroup parent) {
        MainActivity obj = new MainActivity();
        TextView txtView = new TextView(contex);
        txtView.setText(subText[groupPosition][childPosition]);
        return txtView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

}
