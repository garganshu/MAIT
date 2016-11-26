package in.MAIT;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.widget.Button;
import android.widget.EditText;



public class location1 extends Activity {

    WebView web;
    ProgressDialog pd;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_location1);
        web = (WebView) findViewById(R.id.loci);
        web = new WebView(this);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebChromeClient(new WebChromeClient());
        setContentView(web);


        pd = new ProgressDialog(location1.this);
        pd.setMessage("Please wait Loading....");
        pd.show();


        web.setWebViewClient(new myWebClient());
        web.loadUrl("https://www.google.co.in/maps/place/Maharaja+Agrasen+Institute+of+Technology/@28.7196143,77.0639976,17z/data=!3m1!4b1!4m5!3m4!1s0x390d068dbf44ecd7:0xc4ce5551f8ac8360!8m2!3d28.7196143!4d77.0661863");



    }



    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            if (!pd.isShowing()) {
                pd.show();
            }
            return true;

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            if (pd.isShowing()) {
                pd.dismiss();
            }
            super.onPageFinished(view, url);


        }
    }

    //flip screen not loading again
    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(event.getAction() == KeyEvent.ACTION_DOWN){
            switch(keyCode)
            {
                case KeyEvent.KEYCODE_BACK:
                    if(web.canGoBack()){
                        web.goBack();
                    }
                    else
                    {
                        backButtonHandler();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
    public void backButtonHandler() {
        Intent i =new Intent (location1.this, navigation.class);
        startActivity(i);
    }
}