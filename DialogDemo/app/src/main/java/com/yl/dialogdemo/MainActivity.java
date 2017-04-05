package com.yl.dialogdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowDialog = (Button) findViewById(R.id.btn_show_dialog);
        btnShowDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        DialogUtils.showSecurityCodeInputDialog(this, new DialogUtils.DialogOnClickListener() {
            @Override
            public void onClick(String str) {
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
                DialogUtils.dialogDismiss();
            }
        });
    }
}
