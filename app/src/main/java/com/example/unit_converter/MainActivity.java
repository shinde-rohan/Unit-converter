package com.example.unit_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.unit_converter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    EditText editText,editText2 ;
    String value;
    Button btn1,btn2,btn3,btn4,btn5,btn6;
    float enteredValue;
    float result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        editText = findViewById(R.id.et1);
        editText2 = findViewById(R.id.et2);

        binding.mtoKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = editText.getText().toString();
                enteredValue = Float.parseFloat(value);
                result = enteredValue/1000;
                binding.et2.setText(result +" km");

            }
        });
        binding.kmtoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = editText.getText().toString();
                enteredValue = Float.parseFloat(value);
                result = enteredValue *1000;
                binding.et2.setText(result +" km");
            }
        });
        binding.gramtoKg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = editText.getText().toString();
                enteredValue = Float.parseFloat(value);
                result = enteredValue /1000;
                binding.et2.setText(result +" kg");
            }
        });
        binding.kgtoGram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = editText.getText().toString();
                enteredValue = Float.parseFloat(value);
                result = enteredValue *1000;
                binding.et2.setText(result +" g");
            }
        });
        binding.celisustoFr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = editText.getText().toString();
                enteredValue = Float.parseFloat(value);
                result =( enteredValue * 9/5)+32;
                binding.et2.setText(result +" °F");
            }
        });
        binding.frtoCelius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = editText.getText().toString();
                enteredValue = Float.parseFloat(value);
                result = (float) ((enteredValue - 32) / 1.8);
                binding.et2.setText(result +" °C");
            }
        });

    }



}