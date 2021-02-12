package com.example.javaandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private TextView txtHello;
private EditText edTextName;
    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.idHelloSF:
                Toast.makeText(this, "Hello button clicked", Toast.LENGTH_SHORT).show();
                txtHello.setText("Hello "+ edTextName.getText().toString());
                break;
            case R.id.edTxtName:
                Toast.makeText(this, "Attempting to type smth", Toast.LENGTH_SHORT).show();

            default:
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.idHelloSF);
        btnHello.setOnClickListener(this::onClick);

        edTextName = findViewById(R.id.edTxtName);
edTextName.setOnClickListener(this::onClick);
        txtHello= findViewById(R.id.txtHello);
        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "LongPress", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
            }
}