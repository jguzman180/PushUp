package one.test.com.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void TestUpload(){
        int i = 1+1;
        int j = 2;
        int k = i + j;
    }
}// END APPLICATION CLASS MainActivity
