package com.example.signuppage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Signup;
    EditText name,pass,conpass;
    TextView message;
    String uname,passw,cpassw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Signup=findViewById(R.id.SButton);
        name = findViewById(R.id.UserName);
        pass = findViewById(R.id.Password);
        conpass = findViewById(R.id.ConfirmPassword);
        message=findViewById(R.id.popup);
        Signup.setOnClickListener(v->{
            uname=name.getText().toString();
            passw=pass.getText().toString();
            cpassw=conpass.getText().toString();
            if(!uname.equals("") && !passw.equals("") && !cpassw.equals("") && !uname.equals("Enter User Name:") && !passw.equals("Enter Password:") && !cpassw.equals("Confirm Password:") ){
                if(passw.equals(cpassw))
                    message.setText(R.string.Success);
                else
                    message.setText(R.string.wrong);
                name.setText(R.string.UserName);
                pass.setText(R.string.Password);
                conpass.setText((R.string.ConfirmPassword));
            }
            else{
                message.setText(R.string.Efield);
                name.setText(R.string.UserName);
                pass.setText(R.string.Password);
                conpass.setText((R.string.ConfirmPassword));
            }

        });
        name.setOnClickListener(v->{
            message.setText("");
            name.setText("");
        });
        pass.setOnClickListener(v->{
            message.setText("");
            pass.setText("");
        });
        conpass.setOnClickListener(v->{
            message.setText("");
            conpass.setText("");
        });
    }
}