package com.example.eatcakegame;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.lang.Integer.valueOf;


public class MainActivity extends AppCompatActivity {

    private GridView setGrid;
    int rowNo,columnNo,listNo;
    EditText row,column;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    Toolbar toolbar = findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
    //    Objects.requireNonNull(getSupportActionBar()).setTitle("Categories");
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setGrid = findViewById(R.id.sets_gridview);
        row = (EditText) findViewById(R.id.editTextNumber);
        column = (EditText) findViewById(R.id.editTextNumber2);
        //rowNo = Integer.parseInt(row.getText().toString());
        //columnNo = Integer.valueOf(column.getText().toString());

        //listNo = rowNo*columnNo;



        SetsGridAdapter adapter = new SetsGridAdapter(100);
        setGrid.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            MainActivity.this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}