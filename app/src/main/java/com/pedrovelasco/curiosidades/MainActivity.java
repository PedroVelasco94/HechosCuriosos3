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

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = "";
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(5);
                fact = Integer.toString(randomNumber);

                String[] s_array = new String[5];

                s_array[0] = "La curiosidad mato al gato";
                s_array[1] = "El vuelo mas largo que ha hecho una gallina es de 13 segundos";
                s_array[2] = "La silla electrica fue inventada por un dentista.";
                s_array[3] = "El corazon del erizo late un promedio de 300 veces por minuto. ";
                s_array[4] = "Los camellos tienen tres párpados para protejerse de las tormentas de arena.";




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
