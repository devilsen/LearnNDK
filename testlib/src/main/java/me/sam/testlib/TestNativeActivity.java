package me.sam.testlib;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * desc :
 * date : 2019-05-23
 *
 * @author : dongSen
 */
public class TestNativeActivity extends AppCompatActivity {

    static {
        System.loadLibrary("test-lib");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_native);

        TextView contentText = findViewById(R.id.text_view_content);

        contentText.setText(getBook());
    }


    public native String getBook();
}
