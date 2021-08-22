package com.example.seesister.ui.activity;

import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.seesister.R;
import com.example.seesister.ui.fragment.SettingFragment;
import com.r0adkll.slidr.Slidr;

import io.reactivex.annotations.Nullable;

/**
 * 描述：设置的Activity
 */

public class SettingActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Slidr.attach(this);
        initData();
        initView();
    }

    private void initData() {

    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("设置");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(view -> finish());

        getSupportFragmentManager().beginTransaction().replace(R.id.cly_root, SettingFragment.newInstance()).commit();

    }


}
