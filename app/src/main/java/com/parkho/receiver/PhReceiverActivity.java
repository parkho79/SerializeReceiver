package com.parkho.receiver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.parkho.ShareData;

public class PhReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShareData shareData = (ShareData) getIntent().getSerializableExtra("Serialize");
        if (shareData == null) {
            return;
        }

        ((TextView) findViewById(R.id.tv_name_data)).setText(shareData.getName());

        ((TextView) findViewById(R.id.tv_number_data)).setText(String.valueOf(shareData.getNumber()));

        ((TextView) findViewById(R.id.tv_serializable_data)).setText(String.valueOf(shareData.isSerializable()));
    }
}
