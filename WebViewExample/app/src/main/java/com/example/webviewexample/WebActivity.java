package com.example.webviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    private WebView webiew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webiew = (WebView) findViewById(R.id.webview);
        WebSettings websettings = webiew.getSettings();
        websettings.setJavaScriptEnabled(true);
        webiew.loadUrl("https://www.google.com");
    }
}
