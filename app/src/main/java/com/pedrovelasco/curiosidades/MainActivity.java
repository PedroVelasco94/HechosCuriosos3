package com.pedrovelasco.curiosidades;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarando varriables

        final TextView factLabel = (TextView) findViewById(R.id.textView);
        Button showFactButton = (Button) findViewById(R.id.boton);


        //BOTON
        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = "";
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(5);
                fact = Integer.toString(randomNumber);

                String[] s_array = new String[5];

                s_array[0] = getString(R.string.p_curiosidad);
                s_array[1] = getString(R.string.p2_curiosidad);
                s_array[2] = getString(R.string.p3_curiosidad);
                s_array[3] = getString(R.string.p4_curiosidad);
                s_array[4] = getString(R.string.p5_curiosidad);




                factLabel.setText(s_array[Integer.parseInt(fact)]);

            }
        });


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
