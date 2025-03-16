package com.example.testapp;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.GenericArrayType;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);
        linearLayout.setPadding(50,50,50,50);
        linearLayout.setBackgroundColor(Color.parseColor("#2E8B57"));
        Typeface typeface = ResourcesCompat.getFont(this, R.font.phantom_muff);


        TextView textView = new TextView(this);
        textView.setGravity(Gravity.CENTER);
        textView.setText("My first text in Andriod");
        textView.setTextColor(Color.parseColor("#BDB76B"));
        textView.setTextSize(24f);

        textView.setTypeface(typeface);

        EditText editText = new EditText(this);
        editText.setTextColor(Color.parseColor("#FFDEAD"));
        editText.setTextSize(20f);
        editText.setBackgroundColor(Color.parseColor("#3CB371"));
        editText.setTypeface(typeface);
        editText.setGravity(Gravity.CENTER);

        Button button = new Button(this);
        button.setTextColor(Color.parseColor("#E0FFFF"));

        button.setTypeface(typeface);
        button.setTextSize(18f);
        button.setText("Click me");
        button.setBackgroundColor(Color.parseColor("#66CDAA"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText());
            }
        });

        Switch sw = new Switch(this);
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw.isChecked())
                {
                    button.setBackgroundColor(Color.YELLOW);
                    button.setTextColor(Color.BLUE);
                }
                else
                {
                    button.setBackgroundColor(Color.BLUE);
                    button.setTextColor(Color.YELLOW);
                }

            }
        });

        CheckBox checkBox = new CheckBox(this);
        checkBox.setText("Check it");
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked())
                {
                    checkBox.setText("Checked");
                }
                else
                {
                    checkBox.setText("Unchecked");
                }

            }
        });

        ToggleButton tgBtn = new ToggleButton(this);
        tgBtn.setText("background changer");
        tgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tgBtn.isChecked())
                {
                    linearLayout.setBackgroundColor(Color.parseColor("#FF7F50"));
                    tgBtn.setText("Oringe");
                }else
                {
                    linearLayout.setBackgroundColor(Color.parseColor("#2E8B57"));
                    tgBtn.setText("Green");
                }
            }
        });

        linearLayout.addView(textView);
        linearLayout.addView(editText);
        linearLayout.addView(button);
        linearLayout.addView(checkBox);
        linearLayout.addView(sw);
        linearLayout.addView(tgBtn);


        EditText text = findViewById(R.id.text);
        EditText personName = findViewById(R.id.textPersonName);
        EditText phone = findViewById(R.id.phone);
        EditText password = findViewById(R.id.textPassword);
        EditText number = findViewById(R.id.number);
        EditText email = findViewById(R.id.textEmailAddress);



//        setContentView(linearLayout);
        setContentView(R.layout.registration_layout);

    }
}