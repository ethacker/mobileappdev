package com.example.ethan.pizzastore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class checkout extends Activity {

    int toppingscount;
    boolean delivery;
    ArrayList<String> toppingsAdded;
    TableRow toppingsRow;
    double total;
    double deliveryPrice;
    TextView[]toppings;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);


        intent = getIntent();

        toppingscount = intent.getExtras().getInt(MainActivity.toppings_count);
        delivery = intent.getExtras().getBoolean(MainActivity.delivery);
        toppingsAdded = intent.getStringArrayListExtra(MainActivity.toppings_added);
        toppingsRow = (TableRow) findViewById(R.id.toppingsRow);
        toppings = new TextView[toppingscount];


        for(int i=0; i<toppingscount;i++) {

            toppings[i] = new TextView(this);
            toppings[i].setText(toppingsAdded.get(i)+" ");



            toppingsRow.addView(toppings[i],TableRow.LayoutParams.MATCH_PARENT,TableRow.LayoutParams.MATCH_PARENT);

        }

        TextView toppingsPrice = (TextView) findViewById(R.id.toppingsPrice);
        toppingsPrice.setText(toppingscount*1+"");

        TextView deliveryCost = (TextView) findViewById(R.id.deliveryCost);
        if(delivery){
            deliveryPrice = 4.00;
            deliveryCost.setText(4.00 + "");
        }
        else{
            deliveryPrice = 0.00;
            deliveryCost.setText(0.00 +"");
        }

        total = deliveryPrice + (toppingscount * 1.5) + 6.50;

        TextView totalCost = (TextView) findViewById(R.id.totalcost);

        totalCost.setText(total+"");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_checkout, menu);
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

    public void finishApp(View view){



        finish();

        MainActivity.firstActivity.finish();


    }
}
