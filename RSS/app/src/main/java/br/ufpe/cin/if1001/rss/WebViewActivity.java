package br.ufpe.cin.if1001.rss;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by mathe on 02/04/2018.
 */

public class WebViewActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_activity);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        Intent intentContent = getIntent();
        myWebView.loadUrl(intentContent.getStringExtra("url"));
    }
}
