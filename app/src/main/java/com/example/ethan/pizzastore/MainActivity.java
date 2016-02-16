package com.example.ethan.pizzastore;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    CharSequence [] toppings = {"Bacon", "Cheese", "Garlic", "Green Pepper", "Mushroom", "Olives","Onions","Red Pepper"};
    TableRow toppings2;
    TableRow toppings1;
    ImageView bacon;
    ImageView cheese;
    ImageView garlic;
    ImageView gpepper;
    ImageView mushroom;
    ImageView olives;
    ImageView onions;
    ImageView rpepper;
    int toppingsCount;
    ProgressBar toppingsBar;
    CheckBox deliveryBox;
    static final String toppings_count = "TC";
    static final String delivery = "D";
    static final String toppings_added = "toppingsAdded";
    ArrayList<String> toppingsAdded;
    static Activity firstActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstActivity = this;

        toppings1 = (TableRow) findViewById(R.id.toppingsRow1);
        toppings2 = (TableRow) findViewById(R.id.toppingsRow2);
        deliveryBox = (CheckBox) findViewById(R.id.deliveryBox);
        deliveryBox.setChecked(false);


        toppingsBar = (ProgressBar) findViewById(R.id.toppingsBar);
        toppingsBar.setMax(10);
        toppingsBar.setProgress(0);

        toppingsAdded = new ArrayList();



        toppingsCount = 0;



    }

    public void addToppings(View view){

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setCancelable(false)
                .setTitle("Choose Toppings")
                .setItems(toppings, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (toppingsCount < 5) {
                            if (which == 0) {

                                bacon = new ImageView(MainActivity.this);
                                bacon.setImageResource(R.mipmap.bacon);

                                toppings1.addView(bacon, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);

                                toppingsAdded.add("Bacon");

                                toppingsCount++;

                            }
                            if (which == 1) {

                                cheese = new ImageView(MainActivity.this);
                                cheese.setImageResource(R.mipmap.cheese);

                                toppings1.addView(cheese, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Cheese");
                            }
                            if (which == 2) {
                                garlic = new ImageView(MainActivity.this);
                                garlic.setImageResource(R.mipmap.garlic);

                                toppings1.addView(garlic, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Garlic");
                            }
                            if (which == 3) {
                                gpepper = new ImageView(MainActivity.this);
                                gpepper.setImageResource(R.mipmap.gpepper);

                                toppings1.addView(gpepper, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Green Peppers");
                            }
                            if (which == 4) {
                                mushroom = new ImageView(MainActivity.this);
                                mushroom.setImageResource(R.mipmap.mushroom);

                                toppings1.addView(mushroom, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Mushrooms");
                            }
                            if (which == 5) {
                                olives = new ImageView(MainActivity.this);
                                olives.setImageResource(R.mipmap.olive);

                                toppings1.addView(olives, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Olives");
                            }
                            if (which == 6) {

                                onions = new ImageView(MainActivity.this);
                                onions.setImageResource(R.mipmap.onion);
                                toppings1.addView(onions, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Onions");
                            }
                            if (which == 7) {
                                rpepper = new ImageView(MainActivity.this);
                                rpepper.setImageResource(R.mipmap.rpepper);
                                toppings1.addView(rpepper, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Red Peppers");
                            }

                        } else if (toppingsCount < 10) {
                            if (which == 0) {

                                bacon = new ImageView(MainActivity.this);
                                bacon.setImageResource(R.mipmap.bacon);

                                toppings2.addView(bacon, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);

                                toppingsCount++;

                                toppingsAdded.add("Bacon");

                            }
                            if (which == 1) {

                                cheese = new ImageView(MainActivity.this);
                                cheese.setImageResource(R.mipmap.cheese);

                                toppings2.addView(cheese, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Cheese");
                            }
                            if (which == 2) {
                                garlic = new ImageView(MainActivity.this);
                                garlic.setImageResource(R.mipmap.garlic);

                                toppings2.addView(garlic, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Garlic");
                            }
                            if (which == 3) {
                                gpepper = new ImageView(MainActivity.this);
                                gpepper.setImageResource(R.mipmap.gpepper);

                                toppings2.addView(gpepper, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Green Peppers");
                            }
                            if (which == 4) {
                                mushroom = new ImageView(MainActivity.this);
                                mushroom.setImageResource(R.mipmap.mushroom);

                                toppings2.addView(mushroom, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Mushrooms");
                            }
                            if (which == 5) {
                                olives = new ImageView(MainActivity.this);
                                olives.setImageResource(R.mipmap.olive);

                                toppings2.addView(olives, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Olives");
                            }
                            if (which == 6) {

                                onions = new ImageView(MainActivity.this);
                                onions.setImageResource(R.mipmap.onion);
                                toppings2.addView(onions, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Onions");
                            }
                            if (which == 7) {
                                rpepper = new ImageView(MainActivity.this);
                                rpepper.setImageResource(R.mipmap.rpepper);
                                toppings2.addView(rpepper, TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
                                toppingsCount++;

                                toppingsAdded.add("Red Peppers");
                            }


                        } else {


                            Toast.makeText(MainActivity.this, "Maximum Topping Capacity Reached!", Toast.LENGTH_LONG).show();
                        }

                        toppingsBar.setProgress(toppingsCount);

                    }
                });


        AlertDialog toppingsMenu = builder.create();

        toppingsMenu.show();

    }

    public void clearPizza(View view){

        toppings1.removeAllViews();
        toppings2.removeAllViews();

        toppingsCount = 0;

        toppingsBar.setProgress(0);

        deliveryBox.setChecked(false);

    }

    public void checkOut(View view){

        Intent checkout = new Intent(MainActivity.this, checkout.class);

        checkout.putExtra(toppings_count, toppingsCount);
        checkout.putExtra(delivery, deliveryBox.isChecked());
        checkout.putStringArrayListExtra(toppings_added,toppingsAdded);

        startActivity(checkout);



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
