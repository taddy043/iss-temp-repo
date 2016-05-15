package com.example.chessmap;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Button btn;
    EditText txt;

    public void ll(View view) {
        try {
            Integer matrix = Integer.parseInt(txt.getText().toString());
            LinearLayout mainLayout=new LinearLayout(this);
            mainLayout.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams params=new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            );
            mainLayout.setLayoutParams(params);
            boolean isBlack=false;
            LinearLayout letters=new LinearLayout(this);
            letters.setOrientation(LinearLayout.HORIZONTAL);
            Character[] ch={' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
            for(Integer i=0;i<matrix;i++) {
                TextView letterTxt=new TextView(this);
                letterTxt.setBackgroundColor(Color.GRAY);
                letterTxt.setText(ch[i]);
                letterTxt.setWidth(10);
                letterTxt.setHeight(10);
                letters.addView(letterTxt);
            }
            mainLayout.addView(letters);
            for(Integer i=1;i<matrix-1;i++) {
                LinearLayout layout=new LinearLayout(this);
                layout.setOrientation(LinearLayout.HORIZONTAL);
                layout.setLayoutParams(params);
                TextView numberTxt=new TextView(this);
                numberTxt.setBackgroundColor(Color.GRAY);
                numberTxt.setWidth(10);
                numberTxt.setHeight(10);
                numberTxt.setText(i.toString());
                layout.addView(numberTxt);
                for(int j=1;j<matrix-1;j++) {
                    TextView square=new TextView(this);
                    square.setWidth(10);
                    square.setHeight(10);
                    if(isBlack) {
                        square.setBackgroundColor(Color.BLACK);
                        isBlack=false;
                    } else {
                        square.setBackgroundColor(Color.WHITE);
                        isBlack=true;
                    }
                    layout.addView(square);
                }
                layout.addView(numberTxt);
                mainLayout.addView(layout);
            }
            mainLayout.addView(letters);
            setContentView(mainLayout);
        } catch(Exception e) {
            System.out.println("error: "+e);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        txt=(EditText)findViewById(R.id.editText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}