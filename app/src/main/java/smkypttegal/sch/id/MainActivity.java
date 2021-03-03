package smkypttegal.sch.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
//    WebView webviewku;
//    WebSettings websettingsku;
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        webviewku= (WebView) findViewById(R.id.webview1);
//        websettingsku=webviewku.getSettings();
//
//        webviewku.setWebViewClient(new WebViewClient());
//        webviewku.loadUrl("https://smpn4tegal.sch.id//");

        web = findViewById(R.id.webview1);
        WebSettings webSettings=web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setWebViewClient(new Callback());
        web.loadUrl("http://smkypttegal.sch.id/");
    }

    private class Callback extends WebViewClient{
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }
}