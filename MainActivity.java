package com.example.karthik.practiceset2;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int a=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void reset(View view) {
       a=0;
       b=0;
       display1(b);
       display(a);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.value);
        quantityTextView.setText("" + number);
    }
   /* private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
   /* private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.value);
        priceTextView.setText(message);
    }*/
    public void team13(View view){
        a=a+3;
        display(a);
    }
    public void team23(View view){
        b=b+3;
        display1(b);
    }
    public void team12(View view) {
        a = a + 2;
        display(a);
    }
    public void team22(View view) {
        b = b + 2;
        display1(b);
    }
    public void team11(View view) {
        a = a + 1;
        display(a);
    }
    public void team21(View view) {
        b = b + 1;
        display1(b);
    }
    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.value1);
        quantityTextView.setText("" + number);
    }
}


