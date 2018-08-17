package com.smu.chatapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //TAG
    private static final String TAG = MainActivity.class.getSimpleName();

    //UI
    private EditText editTextEmail;
    private EditText editTextpasswd;
    private CheckBox checkBoxAutoLogin;
    private Button buttonJoin;
    private Button buttonLogin;

    //Toast
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI
        editTextEmail = (EditText) findViewById(R.id.MainActivity_edittext_email);
        editTextpasswd = (EditText) findViewById(R.id.MainActivity_edittext_passwd);
        checkBoxAutoLogin = (CheckBox) findViewById(R.id.MainActivity_checkBox_autologin);
        buttonJoin = (Button) findViewById(R.id.MainActivity_button_login);
        buttonJoin = (Button) findViewById(R.id.MainActivity_button_join);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editTextEmail.getText().toString();
                String passwd = editTextpasswd.getText().toString();
                if (email == null)
                    Toast.makeText(mContext, "이메일을 입력하시오.", Toast.LENGTH_SHORT).show();
                else if (passwd == null)
                    Toast.makeText(mContext, "비밀번호를 입력하시오.", Toast.LENGTH_SHORT).show();
            }
              //else

        });
    }
}