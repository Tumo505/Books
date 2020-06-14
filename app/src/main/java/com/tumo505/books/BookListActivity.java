package com.tumo505.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.net.URL;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        TextView tvResult = (TextView) findViewById(R.id.tvResponse);
        try {
            URL bookUrl = ApiUtil.buildUrl("cooking");
            String jsonResult = ApiUtil.getJson(bookUrl);
            tvResult.setText(jsonResult);
        }
        catch (Exception e) {
            Log.d("error", e.getMessage());
        }
    }
}