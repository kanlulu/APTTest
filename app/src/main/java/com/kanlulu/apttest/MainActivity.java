package com.kanlulu.apttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.kanlulu.apt_annotation.BindView;
import com.kanlulu.apt_library.BindViewTools;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_view)
    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"bindView success",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
