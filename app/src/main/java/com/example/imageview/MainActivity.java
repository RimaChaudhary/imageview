package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton rbtn1, rbtn2, rbtn3 ;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.viewimage);
        rbtn1=findViewById(R.id.rbrabbit);
        rbtn2=findViewById(R.id.rbbird);
        rbtn3=findViewById(R.id.rbtiger);

        rbtn1.setOnClickListener(this);
        rbtn2.setOnClickListener(this);
        rbtn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbrabbit:
                imageView.setImageResource(R.drawable.rabbit);
                break;

            case R.id.rbbird:
                imageView.setImageResource(R.drawable.bird);
                break;
            case R.id.rbtiger:
                imageView.setImageResource(R.drawable.tiger);
                break;
        }




    }
}
