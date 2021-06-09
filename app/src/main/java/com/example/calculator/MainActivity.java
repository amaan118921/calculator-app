package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.databinding.ActivityMainBinding;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding;
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.setText("");
                binding.output.setText("");
            }
        });
        binding.dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append(".");
            }
        });
        binding.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("8");
            }
        });
        binding.endBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append(")");
            }
        });
        binding.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("7");
            }
        });
        binding.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("5");
            }
        });

        binding.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("4");
            }
        });
        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("-");
            }
        });
        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("*");
            }
        });
        binding.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("9");
            }
        });

        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("1");
            }
        });
        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("+");
            }
        });
        binding.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("6");
            }
        });
        binding.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("3");
            }
        });
        binding.startBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("(");
            }
        });
        binding.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("2");
            }
        });
        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("0");
            }
        });
        binding.slash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.input.append("/");
            }
        });
        binding.equals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if(binding.input.getText()=="") {

                }
                Expression exp = new ExpressionBuilder(binding.input.getText().toString()).build();
                Double res;
                res = exp.evaluate();

                binding.output.setText(res.toString());
            }
        });
    }
}