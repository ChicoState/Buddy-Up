package com.example.loginpage_main;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.dhaval2404.imagepicker.ImagePicker;


public class SignUp2 extends AppCompatActivity {

    ImageView cover;
    private TextView photoselect;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2);



        cover=findViewById(R.id.cover);
        photoselect= findViewById(R.id.photoselect);
        photoselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ImagePicker.with(SignUp2.this)
               .crop()
               .compress(1024)
               .maxResultSize(1080,1080)
               .start();
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Uri uri = data.getData();
        cover.setImageURI(uri);
    }


}