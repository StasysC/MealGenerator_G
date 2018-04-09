package com.stasys.mealgenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class ProductListActivity extends AppCompatActivity {

    static CheckBox _eggsCheck;
    static CheckBox _flakesCheck;
    static CheckBox _dairyCheck;
    static CheckBox _porkCheck;
    static CheckBox _chickenCheck;
    static CheckBox _beefCheck;
    static CheckBox _fishCheck;
    static CheckBox _cerealCheck;
    static CheckBox _saladCheck;
    static CheckBox _pancakesCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);

        Button generateMealsBtn = (Button) findViewById(R.id.generateMealsBtn);
        generateMealsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent generateMealIntent = new Intent(getApplicationContext(), GeneratedActivity.class);
                MealsData meal = new MealsData();
                meal.mealsSelection();
                startActivity(generateMealIntent);
            }
        });

        _eggsCheck = (CheckBox) findViewById(R.id.eggsCheckBox);
        _flakesCheck = (CheckBox) findViewById(R.id.flakesCheckBox);
        _dairyCheck = (CheckBox) findViewById(R.id.dairyCheckBox);
        _chickenCheck = (CheckBox) findViewById(R.id.chickenCheckBox);
        _porkCheck = (CheckBox) findViewById(R.id.porkCheckBox);
        _beefCheck = (CheckBox) findViewById(R.id.beefCheckBox);
        _fishCheck = (CheckBox) findViewById(R.id.fishCheckBox);
        _cerealCheck = (CheckBox) findViewById(R.id.cerealCheckBox);
        _pancakesCheck = (CheckBox) findViewById(R.id.pancakesCheckBox);
        _saladCheck = (CheckBox) findViewById(R.id.saladCheckBox);



    }
}
