package smkypttegal.sch.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webviewku;
    WebSettings websettingsku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webviewku= (WebView) findViewById(R.id.webview1);
        websettingsku=webviewku.getSettings();

        webviewku.setWebViewClient(new WebViewClient());
        webviewku.loadUrl("https://sman4tegal.sch.id/");
    }
}