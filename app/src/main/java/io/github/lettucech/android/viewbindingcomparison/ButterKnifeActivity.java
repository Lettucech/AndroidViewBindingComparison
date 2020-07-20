package io.github.lettucech.android.viewbindingcomparison;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;


public class ButterKnifeActivity extends AppCompatActivity {

    @BindView(R2.id.textView1)
    public TextView mTextView1;
    @BindView(R2.id.textView2)
    public TextView mTextView2;
    @BindView(R2.id.textView3)
    public TextView mTextView3;
    @BindView(R2.id.textView4)
    public TextView mTextView4;
    @BindView(R2.id.textView5)
    public TextView mTextView5;
    @BindView(R2.id.textView6)
    public TextView mTextView6;
    @BindView(R2.id.textView7)
    public TextView mTextView7;
    @BindView(R2.id.textView8)
    public TextView mTextView8;
    @BindView(R2.id.textView9)
    public TextView mTextView9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding);
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