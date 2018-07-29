package nolive.oncasi.kro.great.casino;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    ProgressDialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        dialog = new ProgressDialog(this);
        dialog.setTitle("Please Wait...");


        webView =  findViewById(R.id.webView);
        initWebView("http://jackpotjoy.xyz/landing.php?subid=275&toptittle=jackpotjoy&creid-33061");
    }

    @SuppressLint("SetJavaScriptEnabled")
    public void initWebView(String url) {
        webView.setVisibility(View.VISIBLE);
        webView.setWebViewClient(new WebViewActivity.MyWebViewClient());
        webView.loadUrl(url);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.getSettings().setAllowContentAccess(true);
        webView.loadUrl( url);
    }

    private class MyWebViewClient extends WebViewClient {

        private MyWebViewClient() {
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            dialog.dismiss();
            super.onPageFinished(view, url);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            dialog.show();
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageCommitVisible(WebView view, String url) {
            super.onPageCommitVisible(view, url);
        }
    }

}

