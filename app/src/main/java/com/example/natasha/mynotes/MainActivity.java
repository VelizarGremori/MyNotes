package com.example.natasha.mynotes;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;


        final TableLayout tableLayout = (TableLayout)findViewById(R.id.tablelayout);

        Button button = (Button)findViewById(R.id.but);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TableRow tableRow = crateTableRow();

                tableLayout.addView(tableRow);

            }
        });
    }

    public TableRow crateTableRow(){

        TableRow tableRow = new TableRow(context);

        tableRow.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
                LayoutParams.WRAP_CONTENT));

        TextView data = new TextView(context);
        data.setText("17.08.2018");

        EditText editTextName = (EditText) findViewById(R.id.name);
        TextView name = new TextView(context);
        name.setText(editTextName.getText());

        EditText editTextNum = (EditText) findViewById(R.id.num);
        TextView num = new TextView(context);
        num.setText(editTextNum.getText());

        EditText editTextSum = (EditText) findViewById(R.id.sum);
        TextView sum = new TextView(context);
        sum.setText(editTextSum.getText());

        tableRow.addView(data);
        tableRow.addView(name);
        tableRow.addView(num);
        tableRow.addView(sum);

        return tableRow;
    }
}
