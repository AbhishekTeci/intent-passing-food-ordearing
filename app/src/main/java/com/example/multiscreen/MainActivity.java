package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final String MSG = "com.example.multiscreen.MSG";

    public void placeOrder(View view)
    {
        // Here we handle the button place order.
        // Built a Intent to open another activity

            Intent intent = new Intent(this, OrderActivity.class);
            EditText editText = findViewById(R.id.editText1);
            EditText editText1 = findViewById(R.id.editText2);
            EditText editText2 = findViewById(R.id.editText3);
            String message = "Order for "+ editText.getText().toString() + " , " +
                              editText1.getText().toString() +" & " +
                              editText2.getText().toString() + " has been accepted.";

            intent.putExtra(MSG,message);
            startActivity(intent);


    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}