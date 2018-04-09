package com.stasys.mealgenerator;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ResultSet _rs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button selectProductsBtn = (Button) findViewById(R.id.selectProductsBtn);
        selectProductsBtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent productsListIntent = new Intent(getApplicationContext(), ProductListActivity.class);
                startActivity(productsListIntent);
            }
        });


    }


    private class GetData extends AsyncTask<String, String, String> {

        String msg = "";

        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://" + DbStrings.DATABASE_URL + "/" + DbStrings.DATABASE_NAME;


        @Override
        protected String doInBackground(String... params) {
            Connection conn = null;
            Statement stmt = null;
            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, DbStrings.DATABASE_USERNAME, DbStrings.DATABASE_PASSWORD);
                stmt = conn.createStatement();
                String sql = "SELECT `Option_1` FROM `Meals` WHERE `Product`='eggs'";
                _rs = stmt.executeQuery(sql);

                _rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException connError) {
                msg = "Connection error for JDBC driver";
                connError.printStackTrace();
            } catch (ClassNotFoundException e) {
                msg = "A class not found exception was thrown";
                e.printStackTrace();
            } finally {
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                try {
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }
    }

}// END
