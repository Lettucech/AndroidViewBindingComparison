package io.github.lettucech.android.viewbindingcomparison;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import io.github.lettucech.android.viewbindingcomparison.databinding.ActivityDataBindingBinding;


public class NativeActivity extends AppCompatActivity {

    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;
    private TextView mTextView7;
    private TextView mTextView8;
    private TextView mTextView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding);
        mTextView1 = findViewById(R.id.textView1);
        mTextView2 = findViewById(R.id.textView2);
        mTextView3 = findViewById(R.id.textView3);
        mTextView4 = findViewById(R.id.textView4);
        mTextView5 = findViewById(R.id.textView5);
        mTextView6 = findViewById(R.id.textView6);
        mTextView7 = findViewById(R.id.textView7);
        mTextView8 = findViewById(R.id.textView8);
        mTextView9 = findViewById(R.id.textView9);
        accessTheViews();
    }

    private void accessTheViews() {
        mTextView1.setText("Test");
        mTextView2.setText("Test");
        mTextView3.setText("Test");
        mTextView4.setText("Test");
        mTextView5.setText("Test");
        mTextView6.setText("Test");
        mTextView7.setText("Test");
        mTextView8.setText("Test");
        mTextView9.setText("Test");
    }
}