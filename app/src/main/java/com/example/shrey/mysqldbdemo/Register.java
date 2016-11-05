package com.example.shrey.mysqldbdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText ET_NAME,ET_USER_NAME,ET_USER_PASS;
    String name,user_name,user_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //code that displays the content in full screen mode
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//int flag, int mask
        setContentView(R.layout.activity_register);
        ET_NAME = (EditText)findViewById(R.id.name);
        ET_USER_NAME=(EditText)findViewById(R.id.new_user_name);
        ET_USER_PASS=(EditText)findViewById(R.id.new_user_pass);

    }
    public void userReg(View view)
    {
        name = ET_NAME.getText().toString();
        user_name=ET_USER_NAME.getText().toString();
        user_pass=ET_USER_PASS.getText().toString();
        String method = "register";
        BackgroundTask backgroundtask = new BackgroundTask(this);
        backgroundtask.execute(method,name,user_name,user_pass);
        finish();

    }
    public void userLog(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
}
