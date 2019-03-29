package com.demo.lijian.windowmanagerdemo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.demo.lijian.windowmanagerdemo.util.WindowUtils;

public class MainActivity extends AppCompatActivity {
    Button showBtn,hideBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showBtn=(Button)findViewById(R.id.show_btn);
        hideBtn=(Button)findViewById(R.id.hide_btn);
        Dialog dialog = new Dialog(this,R.style.dialog_style);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WindowUtils.showPopupWindow(getApplicationContext());
            }
        });
        hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WindowUtils.hidePopupWindow();
            }
        });

    }
}
