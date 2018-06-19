package com.t3h.demomap.googlemap;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.t3h.demomap.R;

/**
 * Created by Admins on 6/17/2018.
 */

public class DirectionActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    private EditText editText;
    private Button button;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView.findViewById(R.id.txt_origin);
        textView.setOnClickListener(this);
        editText.findViewById(R.id.destination);
        editText.setOnClickListener(this);
        button.findViewById(R.id.search);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String origin=editText.getText().toString();
        String destination=button.getText().toString();
        android.support.v4.app.Fragment fragment=getSupportFragmentManager()
                .findFragmentByTag(DirectionMapFragment.class.getName());
       // ((DirectionMapFragment)fragment.search(origin,destination));


    }
}
