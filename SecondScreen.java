package com.gopinadh.reg18h71a0574;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        t=findViewById(R.id.tv);
        String un=getIntent().getStringExtra("username");
        String ur=getIntent().getStringExtra("userroll");
        String uph=getIntent().getStringExtra("userphone");
        String up=getIntent().getStringExtra("userpass");
        String ue=getIntent().getStringExtra("useremail");
        String ug=getIntent().getStringExtra("usergender");
        String ub=getIntent().getStringExtra("userbranch");
        t.setText("Name:"+un+"\nRoll Number:"+ur+"\nPhone Number:"+uph+"\nUser Password:"+up+"\nEmail id:"+ue+"\nGender:"+ug+"\nBranch:"+ub);
    }
}
