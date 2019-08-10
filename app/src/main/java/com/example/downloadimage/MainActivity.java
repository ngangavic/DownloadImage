package com.example.downloadimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    EditText editTextUrl;
    Button buttonDownload;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUrl = findViewById(R.id.editText);
        buttonDownload=findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);
        buttonDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load(getUrl()).into(imageView);
            }
        });
    }

    //configure the url to use http
    private String getUrl(){
       return "http://"+editTextUrl.getText().toString();
    }

}
