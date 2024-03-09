package com.example.gradienttextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/index.html");

        // Show gradient for 1 minute
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start SecondActivity
                Intent intent = new Intent(MainActivity.this, secondActivity.class);
                startActivity(intent);
                finish(); // Optional, if you don't want to keep MainActivity in the back stack
            }
        }, 30000); // 30000 milliseconds = 30 sec
    }
}
