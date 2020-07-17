package io.github.lettucech.android.viewbindingcomparison;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import io.github.lettucech.android.viewbindingcomparison.databinding.ActivityViewBindingBinding;

public class ViewBindingActivity extends AppCompatActivity {

    private ActivityViewBindingBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityViewBindingBinding.inflate(getLayoutInflater());
    }

    private void accessTheViews() {
        mBinding.textView1.setText("Test");
        mBinding.textView2.setText("Test");
        mBinding.textView3.setText("Test");
        mBinding.textView4.setText("Test");
        mBinding.textView5.setText("Test");
        mBinding.textView6.setText("Test");
        mBinding.textView7.setText("Test");
        mBinding.textView8.setText("Test");
        mBinding.textView9.setText("Test");
    }
}