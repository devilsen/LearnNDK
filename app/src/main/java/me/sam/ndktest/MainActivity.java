package me.sam.ndktest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import me.sam.testlib.TestNativeActivity;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);

        NDKTest test = new NDKTest();
//        tv.setText(String.valueOf(test.add(3, 4)));
        tv.setText(test.getBook());
    }

    public void toTest(View view) {
        Intent intent = new Intent(this, TestNativeActivity.class);
        startActivity(intent);
    }
}
