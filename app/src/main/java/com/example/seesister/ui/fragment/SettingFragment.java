package com.example.seesister.ui.fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.seesister.R;
import com.example.seesister.utils.PackageUtils;
import com.example.seesister.utils.ResUtils;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;

/**
 * 描述： 应用设置的Fragment
 */

public class SettingFragment extends Fragment {

    private TextView tv_app_version;

    public static SettingFragment newInstance() {
        SettingFragment fragment = new SettingFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        tv_app_version = view.findViewById(R.id.tv_app_version);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String version = PackageUtils.packageName();
        if(version != null) {
            String msg = String.format(ResUtils.getString(R.string.cur_version), version);
            tv_app_version.setText(msg);
        }
    }
}
