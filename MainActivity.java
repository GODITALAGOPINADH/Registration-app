package com.gopinadh.reg18h71a0574;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,rollno,phoneno,password,emailid;
    RadioButton male,female;
    String gender;
    Spinner branch;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.sname);
        rollno=findViewById(R.id.srollno);
        phoneno=findViewById(R.id.sphone);
        password=findViewById(R.id.spassword);
        emailid=findViewById(R.id.semailid);
        male=findViewById(R.id.smale);
        female=findViewById(R.id.sfemale);
        branch=findViewById(R.id.sbranch);
        button=findViewById(R.id.sdisplay);

    }

    public void getdata(View view) {
        String n,r,p,e,ph,b;
        String nameok ="";
        String rollok="";
        String passwordok="";
        String emailok="";
        String phoneok="";
        String branchok="";
        String genderok="";
        n=name.getText().toString();
        if(n.equals("")) {
            Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show();
        }
        else{
            nameok="OK";
        }
        r=rollno.getText().toString();
        if(r.equals("")){
            Toast.makeText(this,"Enter Rollno",Toast.LENGTH_SHORT).show();
        }
        else{
            rollok="OK";
        }
        ph=phoneno.getText().toString();
        if(ph.equals("")){
            Toast.makeText(this,"Enter Phone Number",Toast.LENGTH_SHORT).show();
        }
        else{
            phoneok="OK";
        }
        p=password.getText().toString();
        if(p.equals("")){
            Toast.makeText(this,"Enter Password",Toast.LENGTH_SHORT).show();
        }
        else {
            passwordok="OK";
        }
        e=emailid.getText().toString();
        if(e.equals("")){
            Toast.makeText(this,"Enter Email id",Toast.LENGTH_SHORT).show();
        }
        else{
            emailok="OK";
        }
        if(male.isChecked()) {
            gender = male.getText().toString();
            genderok="OK";

        }
        else if(female.isChecked()){
            gender = female.getText().toString();
            genderok="OK";
        }
        else{
            genderok="";
        }
        b=branch.getSelectedItem().toString();
        if(b.equals("")){
            Toast.makeText(this,"Select Branch",Toast.LENGTH_SHORT).show();
        }
        else{
            branchok="OK";
        }
        if(nameok.equals("OK") && rollok.equals("OK") && phoneok.equals("OK") && passwordok.equals("OK") && emailok.equals("OK") && genderok.equals("OK") && branchok.equals("OK")){
            Intent i=new Intent(this,SecondScreen.class);
            i.putExtra("username",n);
            i.putExtra("userroll",r);
            i.putExtra("userphone",ph);
            i.putExtra("userpass",p);
            i.putExtra("usergender",gender);
            i.putExtra("useremail",e);
            i.putExtra("userbranch",b);
            startActivity(i);
        }

    }
}
