package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.height);
                double height=Double.parseDouble(et.getText().toString());
                String sex="";
                RadioButton rb1 = (RadioButton) findViewById(R.id.sex1);
                if(rb1.isChecked()) {
                    sex="M";
                }
                else {
                    sex="F";
                }
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity2.class);
 
                Bundle bndl = new Bundle();
                bndl.putDouble("height",height);
                bndl.putString("sex",sex);
 
                intent.putExtras(bndl);
 
                /*调用Activity EX03_10_1*/
                startActivity(intent);
            }   /* end of onClick()  */
        } /* end of Button.OnClickListener() */ ) ;
    }  /* end of onCreate()  */
}  /* end of class EX03_10  */


            }
}
