package com.aaqanddev.justjavasampleapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

//
//* This app displays an order form to order coffee.

public class MainActivity extends AppCompatActivity{
    int quant = 2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/**
 * This method is called when the order button is clicked.
*/
    public void submitOrder(View view){
        int price = quant*5;
        String priceMsg = "Total: $" + price +"\nThank you!";
        displayMessage(priceMsg);
    }
/**
 * This method displays the given quantity value on the screen.
*/
    private void display(int number){
        TextView quantTV = (TextView) findViewById(R.id.quant_tv);
        quantTV.setText(""+ number);
    }
/**
 * This method displays the given price on the screen.
 */
    private void displayPrice(int number){
        TextView priceTV = (TextView) findViewById(R.id.price_tv);
        priceTV.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_tv);
        priceTextView.setText(message);
    }
    /**
     * This method increments the quant of coffees on + button click
     */
    public void increment(View view){
        quant++;
        display(quant);
    }
    /**
     * This method decrements the quant of coffee ordered on - button click
     */
    public void decrement(View view){
        quant--;
        display(quant);
    }
}